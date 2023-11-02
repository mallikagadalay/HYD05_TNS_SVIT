package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Certificate;

public interface CertificateService {

	public Certificate saveCertificate(Certificate certificate);

	public List<Certificate> fetchCertificateList();

	public Certificate fetchCertificateById(Long id);

	public void deleteCertificateById(Long id);

	public Certificate updateCertificate(Long id, Certificate certificate);
}
