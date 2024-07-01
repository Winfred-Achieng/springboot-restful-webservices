package com.winfred.springbootrestfulwebservices.Repository;

import com.winfred.springbootrestfulwebservices.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}