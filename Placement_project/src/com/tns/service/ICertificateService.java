package com.tns.service;

import com.tns.entities.Certificate;

public interface ICertificateService {
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(long id);
	Certificate deleteCertificate(long id);
	

}
