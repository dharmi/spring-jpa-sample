package com.adobe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adobe.entities.Service;

public interface ServiceRepository extends JpaRepository<Service, String> {

	public Service findById(String id);
	public Service findByService(String service);

}
