package com.generation.animales;

public abstract class Animal {

    protected String nombre;
    protected int edad;

    public Animal (String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor padre");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comunicarse() {
        System.out.println("Hola");
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

    public abstract void respirar();
}
