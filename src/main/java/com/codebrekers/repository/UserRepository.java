package com.codebrekers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codebrekers.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 

}
