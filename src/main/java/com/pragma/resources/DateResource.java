package com.pragma.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test3")
public class DateResource {

	@PathParam("") String nombre;
	
	@GET
	@Path("{dateString}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getString(@PathParam("dateString") MyDate myDate) {
		return "Got " + myDate.toString();
	}
	
}
