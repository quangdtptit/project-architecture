package com.example.architecture.layered.repository;

import com.example.architecture.layered.model.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  @Query("SELECT u FROM User u WHERE UPPER(u.email) = UPPER(:email) AND (:userId IS NULL OR u.userId <> u.userId)")
  Optional<User> findByEmail(String email, Long userId);
}
