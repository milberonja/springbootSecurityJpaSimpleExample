package com.milan.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milan.springbootsecurity.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
