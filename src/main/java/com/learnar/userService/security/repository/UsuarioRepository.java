package com.learnar.userService.security.repository;



import com.learnar.userService.security.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Users,Long> {



    Optional<Users> findByUserName(String nombre);
    boolean existsByUserName(String nombre);
    boolean existsByEmail(String email);


}
