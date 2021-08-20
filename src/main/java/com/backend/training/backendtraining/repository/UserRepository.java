package com.backend.training.backendtraining.repository;

import com.backend.training.backendtraining.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/users")
public interface UserRepository extends JpaRepository<User, String> {

}
