/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

public abstract class VehiculoBase implements IVehiculo {
     String marca;
    String modelo;
    int velocidad;

    public VehiculoBase(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    
    public int acelerar(int velocidad){
            
    return velocidad+=10;
    }
    
    
    public int frenar (int velocidad){
    
    return velocidad-=10;
    }
}



