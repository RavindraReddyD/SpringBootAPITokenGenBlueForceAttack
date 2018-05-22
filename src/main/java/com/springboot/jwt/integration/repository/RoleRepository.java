package com.springboot.jwt.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jwt.integration.domain.Role;

/**
 * Created by nydiarra on 06/05/17.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
