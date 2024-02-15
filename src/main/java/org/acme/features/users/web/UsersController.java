package org.acme.features.users.web;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.features.users.models.UserDto;
import org.acme.features.users.models.UsersEntity;
import org.acme.features.users.usecases.AddUsersUseCase;
import org.acme.features.users.usecases.FindAllUsersUseCase;

import java.util.List;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersController {

    @Inject
    AddUsersUseCase addUsersUseCase;

    @Inject
    FindAllUsersUseCase findAllUsersUseCase;

    @POST
    public Response addUser(UserDto userDto) {
        UsersEntity addedUser = addUsersUseCase.addUser(userDto);
        return Response.ok(addedUser).build();
    }

    @GET
    public List<UsersEntity> getAllUsers() {
        return findAllUsersUseCase.findAllUsers();
    }
}
