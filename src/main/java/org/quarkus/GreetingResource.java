package org.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import io.quarkus.logging.Log; 

@Path("/hello")
public class GreetingResource {

    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(
        // uncomment below line for A/B testing of the described behaviour.
        // @PathParam 
        String id
        ) {
        Log.info(id);
        return "Hello, " + id + "!";
    }
}