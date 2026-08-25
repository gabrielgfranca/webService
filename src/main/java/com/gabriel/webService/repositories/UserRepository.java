package com.gabriel.webService.repositories;

import com.gabriel.webService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
