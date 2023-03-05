package com.learnar.userService.security.dto;



public class Mensaje {
    private String mensaje;
    private boolean sucess;



    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isSucess() {
        return sucess;
    }

    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    }

    public Mensaje(String mensaje, boolean sucess) {
        this.mensaje = mensaje;
        this.sucess = sucess;
    }


    public Mensaje() {
    }
}
