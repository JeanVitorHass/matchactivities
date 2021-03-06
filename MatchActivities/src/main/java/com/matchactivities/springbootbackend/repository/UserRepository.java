package com.matchactivities.springbootbackend.repository;

import com.matchactivities.springbootbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);


    User findByEmail(String email);

    boolean existsUserByEmail(String email);
}
