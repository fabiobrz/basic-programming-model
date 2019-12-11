package org.jboss.eap.qe.microprofile.openapi.examples.rest;

import org.eclipse.microprofile.openapi.annotations.Operation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Rest resource
 */
@Path("/greet")
public class HelloResource {

    /**
     * Hello
     */
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(summary = "Say hello", description = "a test method", operationId = "sayHello")
    public Response sayHello() {
        return Response.ok().entity("Hi!").build();
    }

}