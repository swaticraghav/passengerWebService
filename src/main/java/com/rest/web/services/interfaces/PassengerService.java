package com.rest.web.services.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.rest.web.services.dto.Passenger;

@Path("/passengerservice")
@Consumes({"application/xml", MediaType.APPLICATION_FORM_URLENCODED})
@Produces("application/xml")
public interface PassengerService {

	//@Path("/passengers")
	//@GET
	//List<Passenger> getPassengers();
	
	@Path("/passengers")
	@GET
	List<Passenger> getPassengers(@QueryParam(value="start")int start, @QueryParam(value="size") int size);
	
	 @Path("/passengers")
	 @POST 
	 Passenger addPassenger(Passenger passenger);
	
	@Path("/passengers/formuri")
	@POST
	String formParamTest(@FormParam(value="firstName") String firstName,  @FormParam(value="lastName") String lastName);
	
	@Path("/passengers/headerparam")
	@POST
	String headerParam(@HeaderParam(value="agentName") String agentName);
	
	@Path("/passengers/headers")
	@POST
	String getHeaders(@Context HttpHeaders headers);
	
	
	
	
	
	
}
