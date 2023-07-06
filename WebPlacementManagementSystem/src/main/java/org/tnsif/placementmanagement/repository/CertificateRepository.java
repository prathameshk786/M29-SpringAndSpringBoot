package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entities.Certificate;

/*JPA repository is an interface which contains all the
 * JPA CRUD operations which is required for Springboot*/
public interface CertificateRepository extends JpaRepository<Certificate,Integer>{

}
