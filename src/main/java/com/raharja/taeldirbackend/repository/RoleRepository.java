package com.raharja.taeldirbackend.repository;
import java.util.Optional;

import com.raharja.taeldirbackend.model.Role;
import com.raharja.taeldirbackend.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}