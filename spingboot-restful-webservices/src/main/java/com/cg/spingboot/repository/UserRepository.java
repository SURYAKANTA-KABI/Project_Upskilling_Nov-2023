package com.cg.spingboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spingboot.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
