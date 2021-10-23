package com.generation.animales;

public class Perro extends Animal implements Mascota,Mamiferos {
    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre) {
        super(nombre);
    }
    public void jugar() {
        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {
        System.out.println("ZzZzZz");
    }

    @Override
    public void hablar() {
        System.out.println("Guaaaff");
    }

    public void ladrar(){
        System.out.println("Goff");
    }

    //Polimorfismo
    //Sobre escribe un método de la clase padre (Modifica el comportamiento del método en la clase padre)
    @Override

    public void comer() {
        System.out.println("Estoy comiendo croquetas");
    }

    @Override
    public void respirar() {

    }

    @Override
    public void gestar() {
        System.out.println("Tengo un tiempo de gestación de 8 semanas");
    }

    @Override
    public void ingerirLeche() {
        System.out.println("Tomo leche de mi mamá");
    }

    @Override
    public void movilidad() {
        System.out.println("Me muevo en tierra usando mis patitas");
    }
}
