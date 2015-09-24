package com.adobe;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adobe.entities.Service;
import com.adobe.repositories.ServiceRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
public class ServiceRepositoryTest {

	@Autowired
	ServiceRepository serviceRepository;
	
	@Test
	public void test() {
		
		Service srv = new Service("1", "one");
		serviceRepository.save(srv);
		
		Service _srv = serviceRepository.findOne(srv.getId());
		System.out.println("service = " + _srv.getService());
		
		Service service = serviceRepository.findByService("one");
		System.out.println("service2=" +service.getId());
		
		Service _service = serviceRepository.findById("1");
		System.out.println("service3=" +_service.getService());
		
		assertNotNull(_srv);
		
	}

}
