package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;

@Service
public class CertificateServiceImplementation implements CertificateService{
	
	@Autowired
	CertificateRepository certificateRepository;
	
	@Override
	public Certificate saveCertificate(Certificate certificate)
	{
		return certificateRepository.save(certificate);
	}
	
	@Override
	public List<Certificate> fetchCertificateList()
	{
		return certificateRepository.findAll();
	}
	
	@Override
	public Certificate fetchCertificateById(Long id)
	{
		return certificateRepository.findById(id).get();
	}
	
	@Override
	public void deleteCertificateById(Long id)
	{
		certificateRepository.deleteById(id);
	}
	
	@Override 
	public Certificate updateCertificate(Long id,Certificate certificate)
	{
		Certificate colDB = certificateRepository.findById(id).get();
		
		if(Objects.nonNull(certificate.getYear()))
		{
			colDB.setYear(certificate.getYear());
		}
		
		if(Objects.nonNull(certificate.getCollege())  && 
				!"".equalsIgnoreCase(certificate.getCollege()))
		{
			colDB.setCollege(certificate.getCollege());
		}
		return certificateRepository.save(colDB);
		
	}
	
}
