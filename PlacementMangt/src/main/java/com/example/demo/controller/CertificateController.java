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

import com.example.demo.entity.Certificate;
import com.example.demo.service.CertificateService;

@RestController
public class CertificateController {

	@Autowired
	CertificateService certificateService;
	
	@PostMapping("/certificate")
	public Certificate saveCertificate(@RequestBody Certificate certificate)
	{
		return certificateService.saveCertificate(certificate);
	}
	
	@GetMapping("/certificate")
	public List<Certificate> fetchCertificateList()
	{
		return certificateService.fetchCertificateList();
	}
	
	//Get by ID
	@GetMapping("/certificate/{id}")
	public Certificate fetchCertificateById(@PathVariable("id") Long id)
	{
		return certificateService.fetchCertificateById(id);
	}
	
	@DeleteMapping("/certificate/{id}")
	public String deleteCertificateById (@PathVariable("id")Long id)
	{
		certificateService.deleteCertificateById(id);
		return "Certificate is deleted Successfully !!";
	}
	
	@PutMapping("/certificate/{id}")
	public Certificate updateCertificate(@PathVariable("id") Long id,@RequestBody Certificate certificate)
	{
		return certificateService.updateCertificate(id,certificate);
	}
	
}
