package com.learnar.userService.security.service;


import com.learnar.userService.security.entity.Roles;
import com.learnar.userService.security.enums.RolNombre;
import com.learnar.userService.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class RoleService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Roles> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

}
