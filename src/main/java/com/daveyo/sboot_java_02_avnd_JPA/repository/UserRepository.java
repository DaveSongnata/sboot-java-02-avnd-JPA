package com.daveyo.sboot_java_02_avnd_JPA.repository;

import com.daveyo.sboot_java_02_avnd_JPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
