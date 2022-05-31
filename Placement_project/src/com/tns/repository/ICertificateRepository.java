package com.tns.repository;

import com.tns.entities.Certificate;

public interface ICertificateRepository {
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(long id);
	Certificate deleteCertificate(long id);
	void beginTransaction() ;
	void commitTransaction();


}
