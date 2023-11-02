package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Placement;
import com.example.demo.service.PlacementService;

@RestController
public class PlacementController {

	@Autowired
	PlacementService placementService;
	
	@PostMapping("/placement")
	public Placement savePlacement(@RequestBody Placement placement)
	{
		return placementService.savePlacement(placement);
	}
	
	@GetMapping("/placement")
	public List<Placement> fetchPlacementList()
	{
		return placementService.fetchPlacementList();
	}
	
	// Get by ID
	@GetMapping("/placement/{id}")
	public Placement fetchPlacementById(@PathVariable("id") Long id)
	{
		return placementService.fetchPlacementById(id);
	}
	
	@DeleteMapping("/placement/{id}")
	public String deletePlacementById(@PathVariable("id") Long id)
	{
		placementService.deletePlacementById(id);
		return "Placement deleted Successfully !!";
	}
	
	@PutMapping("/placement/{id}")
	public Placement updateCollege(@PathVariable("id") Long id,@RequestBody Placement placement)
	{
		return placementService.updatePlacement(id, placement);
	}

}
