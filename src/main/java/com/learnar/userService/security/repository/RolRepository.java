package com.learnar.userService.security.repository;



import com.learnar.userService.security.entity.Roles;
import com.learnar.userService.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Roles,Long> {


    Optional<Roles> findByRolNombre(RolNombre rolNombre);
}
