package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Placement;
import com.example.demo.repository.PlacementRepository;

@Service
public class PlacementServiceImplementation implements PlacementService{
	
	@Autowired
	PlacementRepository placementRepository;
	
	@Override
	public Placement savePlacement(Placement placement)
	{
		return placementRepository.save(placement);
	}
	
	@Override
	public List<Placement> fetchPlacementList()
	{
		return placementRepository.findAll();
	}
	
	@Override
	public Placement fetchPlacementById(Long id)
	{
		return placementRepository.findById(id).get();
	}
	
	@Override
	public void deletePlacementById(Long id)
	{
		placementRepository.deleteById(id);
	}
	
	@Override
	public Placement updatePlacement(Long id,Placement placement)
	{
		Placement colDB = placementRepository.findById(id).get();
		
		if(Objects.nonNull(placement.getName())  && 
				!"".equalsIgnoreCase(placement.getName()))
		{
			colDB.setName(placement.getName());
		}
		
		if(Objects.nonNull(placement.getCollege()) && 
				!"".equalsIgnoreCase(placement.getCollege()))
		{
			colDB.setCollege(placement.getCollege());
		}
		
		if(Objects.nonNull(placement.getDate()))
		{
			colDB.setDate(placement.getDate());
		}
		
		if(Objects.nonNull(placement.getQualification()) && 
				!"".equalsIgnoreCase(placement.getQualification()))
		{
			colDB.setQualification(placement.getQualification());
		}
		
		if(Objects.nonNull(placement.getYear()))
		{
			colDB.setYear(placement.getYear());
		}
				 
		return placementRepository.save(colDB);
	}	
}