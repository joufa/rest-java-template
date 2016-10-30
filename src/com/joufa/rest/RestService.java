package com.joufa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/")
public class RestService {
	@GET
	@Produces("application/json")
	public Response vastaus() throws JSONException {
		JSONObject olio = new JSONObject();
		olio.put("Laulaja", "Matti");
		String result = "" + olio;
		return Response.status(200).entity(result).build();
	}
}
