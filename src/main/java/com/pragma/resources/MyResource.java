package com.pragma.resources;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("test")
public class MyResource {
	
	
	
	@GET
	@Path("{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(@PathParam("id") Integer id) {
		return "It works! " + id;
	}

}
