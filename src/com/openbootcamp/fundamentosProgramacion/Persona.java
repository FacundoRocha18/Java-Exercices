package com.openbootcamp.fundamentosProgramacion;

public class Persona {
    private String nombre;
    private Integer edad;
    private String telefono;


    public Persona(String nombre, Integer edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
}
