package com.learnar.userService.security.entity;


import com.learnar.userService.security.enums.RolNombre;
import com.learnar.userService.security.enums.State;
import com.sun.istack.NotNull;

import javax.persistence.*;



@Entity
public class Roles {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    private RolNombre rolNombre;

    @Enumerated(EnumType.STRING)
    @NotNull
    private State state;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Roles(Long id, RolNombre rolNombre, State state) {
        this.id = id;
        this.rolNombre = rolNombre;
        this.state = state;
    }


    public Roles() {
    }
}
