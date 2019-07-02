package com.luka.sda.eventServiceSystem.repository;

import com.luka.sda.eventServiceSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

     User findByEmail (String email);
}
