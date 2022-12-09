package com.openbootcamp.fundamentosProgamacion;

public class Coche {
    public Integer numeroPuertas;

    public Coche(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Integer aumentarPuertas() {
        return this.numeroPuertas++;
    }
}
