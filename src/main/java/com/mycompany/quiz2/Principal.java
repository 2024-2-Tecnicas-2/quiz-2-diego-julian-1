package com.mycompany.quiz2;

public class Principal {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Honda", "201", 100);
        Coche coche2 = new Coche("Mazda", "2300", 200);
        
        Lancha lancha1 = new Lancha("Ferrari", "abs", 90);
        Lancha lancha2 = new Lancha("Mercedes", "Kan", 80);
        
        //Acelerar:
        
        coche1.acelerar();
        coche2.acelerar();
        lancha1.acelerar();
        lancha2.acelerar();
        
        //Frenar:
        coche1.frenar();
        coche2.frenar();
        lancha1.frenar();
        lancha2.frenar();
        
  
        System.out.println("El coche: "+coche1.combusCoche);
        
    }
}
