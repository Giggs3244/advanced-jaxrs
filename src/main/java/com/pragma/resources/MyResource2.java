package com.pragma.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("test2")
public class MyResource2 {

	@PathParam("id") Integer id;
	@QueryParam("value") String value;
	
	@GET
	@Path("{id}/test")
	public String getString() {
		return "PathParam: " + id + " QueryParam: " + value;
	}
	
}
