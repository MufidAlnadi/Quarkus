package org.acme.features.users.usecases;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.features.users.data.UsersPanacheRepo;
import org.acme.features.users.models.UsersEntity;

import java.util.List;

@ApplicationScoped
public class FindAllUsersUseCase {
    @Inject
    UsersPanacheRepo usersPanacheRepo;
    public List<UsersEntity> findAllUsers() {
        return usersPanacheRepo.listAll();
    }
}
