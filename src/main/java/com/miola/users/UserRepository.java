package com.miola.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

    boolean existsByEmail(String email);

    Optional<UserModel> findByEmail(String email);
}
