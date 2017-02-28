package com.pragma.resources;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("webapi")
public class MyApp extends Application {

	/*
	 * Si no se define este metodo JAX-RS cargara todos los resources
	 * ademas de todos las clases anotadas con @Provider
	 * 
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		resources.add(CommentResource.class);
		resources.add(SecurityFilter.class);
		return resources;
	}
	*/

}
