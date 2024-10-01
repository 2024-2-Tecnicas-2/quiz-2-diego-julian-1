/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

import java.util.logging.Level;

public class Lancha extends VehiculoBase {
    
    TipoCombustible combus ;
    
    public Lancha(String marca, String modelo, int velocidad) {
        super(marca, modelo, velocidad);

      

        this.combus= TipoCombustible.Diesel;

    }
    
    
    @Override
    public void acelerar() {
        
        
        
        System.out.println(velocidad+=10);
    }


    @Override
    public void frenar() {
         System.out.println(velocidad-=10);
    }

    @Override
    public void tipoCombustible() {
        System.out.println(this.combus);
    }

 
  
}
