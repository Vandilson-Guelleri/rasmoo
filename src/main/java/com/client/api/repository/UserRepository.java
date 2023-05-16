package com.client.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
