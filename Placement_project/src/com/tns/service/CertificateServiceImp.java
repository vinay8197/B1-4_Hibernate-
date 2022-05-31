package com.tns.service;

import com.tns.entities.Certificate;
import com.tns.entities.Student;
import com.tns.repository.CertificateRepositoryImp;
import com.tns.repository.ICertificateRepository;

public class CertificateServiceImp implements ICertificateService{
	private ICertificateRepository cao;
	

	public CertificateServiceImp() {
		cao=new CertificateRepositoryImp();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		cao.beginTransaction();
		cao.addCertificate(certificate);
		cao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		cao.beginTransaction();
		cao.updateCertificate(certificate);
		cao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(long id) {
		Certificate certificate =cao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(long id) {
		cao.beginTransaction();
		Certificate certificate=cao.deleteCertificate(id);
		cao.commitTransaction();
		return certificate;
	}

}
