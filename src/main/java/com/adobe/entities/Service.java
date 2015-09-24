package com.adobe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adobe_services")
public class Service {

  @Id
  //@GeneratedValue(strategy = GenerationType.AUTO)
  private String id;
  
  private String service;

  public Service() { }

  public Service(String id, String service) {
	this.id = id;
    this.service = service;
  }

  public String getId() {
    return id;
  }

  public void setId(String value) {
    this.id = value;
  }
  
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }
  
}
