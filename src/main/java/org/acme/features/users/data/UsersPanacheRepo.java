package org.acme.features.users.data;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.features.users.models.UsersEntity;

import java.util.Optional;


@ApplicationScoped
public class UsersPanacheRepo implements PanacheRepository<UsersEntity> {}
