/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

import java.util.logging.Level;

public class Lancha extends VehiculoBase {
    
    TipoCombustibe combus ;
    
    public Lancha(String marca, String modelo, int velocidad) {
        super(marca, modelo, velocidad);
        this.combus= TipoCombustibe.Gasolina;
    }
    
    
    public TipoCombustibe tipoCombustible(TipoCombustibe combus){
     
    return this.combus;
    }

    @Override
    public void acelerar() {
        
     }

    @Override
    public void frenar() {
        
    }

    @Override
    public void tipoCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
