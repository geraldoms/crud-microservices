package com.matera.crudmicroservices.edge.rest.filter;

import javax.ws.rs.QueryParam;

public class PersonFilter {

	@QueryParam("name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
