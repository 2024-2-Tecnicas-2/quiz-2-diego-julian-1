/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

public abstract class VehiculoBase implements IVehiculo {

    @Override
    public String toString() {
        return "El vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + '}';
    }
    String marca;
    String modelo;
    int velocidad;

    public VehiculoBase(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
    public int acelerar(int velocidad){
            
    return velocidad+=10;
    }
    
    
    public int frenar (int velocidad){
    
    return velocidad-=10;
    }
}



