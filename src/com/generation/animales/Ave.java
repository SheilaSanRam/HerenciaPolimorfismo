package com.generation.animales;

//Ave está heredando de animal a través de "extends"
public class Ave extends Animal {

    private int alas;
    private int patas;
    private boolean vuela;
//Constructor
    public Ave (String nombre) {
        //Hay que hacer referencia al constructor padre. Siempre hasta arriba
        super(nombre);
        System.out.println("Constructor hijo");
    }
    public void hacerNido() {
        System.out.println("Estoy haciendo mi nido");
    }

    public void ponerHuevo() {
        System.out.println("Estoy poniendo un huevo");
    }

    @Override
    public void comer () {
        System.out.println("Estoy comiendo alpiste");
    }

    @Override
    public void respirar() {
        System.out.println("Yo respiro por la nariz");
    }
}

