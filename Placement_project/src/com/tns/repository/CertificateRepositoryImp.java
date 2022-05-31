package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entities.Certificate;
import com.tns.entities.Student;

public class CertificateRepositoryImp implements  ICertificateRepository{
	private EntityManager entityManager;
	

	public CertificateRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(long id) {
		Certificate certificate =entityManager.find(Certificate.class,id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(long id) {
		entityManager.remove(id);

		return null;
	}
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}


}
