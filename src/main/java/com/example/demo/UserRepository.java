package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface UserRepository extends JpaRepository<User, Long> {

  // http://localhost:8081/api/users/search/byName?name=gustavo
  @RestResource(path = "byName")
  List<User> findAllByName(String name);

}
