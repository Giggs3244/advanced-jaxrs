package com.pragma.messenger.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pragma.messenger.model.Profile;

public class RestApiClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget baseTarget = client.target("http://localhost:8080/advanced-jaxrs/webapi/");
		WebTarget profileTarget = baseTarget.path("profiles");
		WebTarget singleProfileTarget = profileTarget.path("{nameProfile}");

		Profile profile = singleProfileTarget.resolveTemplate("nameProfile", "koushik")
				.request(MediaType.APPLICATION_JSON).get(Profile.class);

		System.out.println(profile);
				
		Profile newProfile = new Profile(2, "Giggs", "Bryan", "Bedoya");
		
		Response postResponse = profileTarget.request().post(Entity.json(newProfile));
		
		System.out.println("Status code: " + postResponse.getStatus());
		if(postResponse.getStatus() != 201) {
			System.out.println("Error no se pudo crear el Profile");
		}
		
		Profile createdProfile = postResponse.readEntity(Profile.class);
		
		System.out.println(createdProfile);
		
	}

}
