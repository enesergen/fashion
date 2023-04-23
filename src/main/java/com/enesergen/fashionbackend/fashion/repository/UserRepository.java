package com.enesergen.fashionbackend.fashion.repository;

import com.enesergen.fashionbackend.fashion.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalInt;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User>findByEmail(String email);// email also used as a username
}
