/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 * 
 *. Clase abstracta VehiculoBase:
Implementa una clase abstracta que represente las características comunes de
cualquier vehículo. Esta clase debe:
○ Implementar la interfaz Vehiculo.
○ Tener los atributos comunes:
■ marca: String, la marca del vehículo.
■ modelo: String, el modelo del vehículo.
■ velocidadActual: int, la velocidad actual del vehículo.
○ Tener un constructor para inicializar estos atributos.
○ Implementar los métodos acelerar() y frenar() de forma genérica
(por ejemplo, aumentando o reduciendo la velocidad en 10 unidades).

 * @author USUARIO
 */
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



