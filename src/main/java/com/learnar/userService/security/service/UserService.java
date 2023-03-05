package com.learnar.userService.security.service;


import com.learnar.userService.security.entity.Users;
import com.learnar.userService.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {


    @Autowired
    UsuarioRepository usuarioRepository;


    public Optional<Users> getByNombreUsuario(String nombre){
        return usuarioRepository.findByUserName(nombre);
    }

    public boolean existePorNombre(String nombre){
        return usuarioRepository.existsByUserName(nombre);
    }

    public  boolean existePorEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void guardar(Users usuario){
        usuarioRepository.save(usuario);
    }
}
