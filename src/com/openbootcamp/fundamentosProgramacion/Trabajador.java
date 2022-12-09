package com.openbootcamp.fundamentosProgramacion;

public class Trabajador extends Persona {

    public Integer salario;

    public Trabajador(String nombre, Integer edad, String telefono, Integer salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }
}
