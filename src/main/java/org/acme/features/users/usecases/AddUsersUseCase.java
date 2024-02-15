package org.acme.features.users.usecases;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.acme.features.users.data.UsersPanacheRepo;
import org.acme.features.users.models.UserDto;
import org.acme.features.users.models.UsersEntity;

import java.sql.Timestamp;
import java.time.Instant;

@ApplicationScoped
public class AddUsersUseCase {
    @Inject
    UsersPanacheRepo   usersPanacheRepo;

    @Transactional
    public UsersEntity addUser(UserDto userDto) {

        UsersEntity newUser = new UsersEntity();

        newUser.setUpdatedAt(Timestamp.from(Instant.now()));;
        newUser.setCreatedAt(Timestamp.from(Instant.now()));
        newUser.setUpdatedBy(userDto.getUpdatedBy());
        newUser.setCreatedBy(userDto.getCreatedBy());
        newUser.setEnabled(userDto.isEnabled());
        newUser.setFullName(userDto.getFullName());
        newUser.setUsername(userDto.getUsername());
        newUser.setPassword(userDto.getPassword());
        newUser.setMobile(userDto.getMobile());
        newUser.setEmail(userDto.getEmail());
        usersPanacheRepo.persist(newUser);
        return newUser;
    }

    }
