/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */
public  class Coche extends VehiculoBase {

    TipoCombustible combusCoche;

    public Coche(String marca, String modelo, int velocidad) {
        super(marca, modelo, velocidad);
      
        this.combusCoche = TipoCombustible.Gasolina;

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
        System.out.println(this.combusCoche);
    }
}
