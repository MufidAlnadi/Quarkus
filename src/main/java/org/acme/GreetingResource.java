package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

@Path("/hello")
@Tag(name = "test", description = "TEST")
public class GreetingResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(
            operationId ="test",
            summary = "TEST",
            description = "TEST"
    )
    @APIResponse(
            responseCode = "200",
            description = "test",
            content = @Content(mediaType = "text/plain")
    )
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}
