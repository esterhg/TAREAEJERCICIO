package com.example.tareaejercicio;

public class lista {
    public String nombre;
    public String ciudad;
    public String color;

    public lista(String nombre, String ciudad, String color) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getColor() {
        return color;
    }


}


