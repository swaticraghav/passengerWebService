package com.rest.web.services.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Passenger")
public class Passenger {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
