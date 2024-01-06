package com.seha.springauth.repository;

import com.seha.springauth.model.ERole;
import com.seha.springauth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
