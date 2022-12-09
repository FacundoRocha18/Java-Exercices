package com.openbootcamp.fundamentosProgramacion;

public class Cliente extends Persona {
    public Integer credito;

    public Cliente(String nombre, Integer edad, String telefono, Integer credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                '}';
    }
}
