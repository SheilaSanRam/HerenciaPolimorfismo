package com.generation;

import com.generation.Uber.UberBlackDriver;
import com.generation.Uber.UberDriver;
import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {

        /*
        Ave ave = new Ave("petirrojo");
        System.out.println(ave.getNombre());
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();*/

        System.out.println("--------------------");

        /*Perro lomito = new Perro( "Otto");
        /*lomito.jugar();
        lomito.comer();*/

        /*
        Animal animal = new Animal();
        animal.comer();
        animal.hacerNido();
        */

        UberDriver Joao = new UberDriver();

        System.out.println("Uber");
        System.out.println(Joao.calculatePrice(6));


        UberBlackDriver Ruben = new UberBlackDriver();
        System.out.println("UberBlack");
        System.out.println(Ruben.calculatePrice(6));

    }
}
