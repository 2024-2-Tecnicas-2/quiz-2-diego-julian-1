/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */
public class Coche extends VehiculoBase {

    TipoCombustibe combusCoche;

    public Coche(String marca, String modelo, int velocidad) {
        super(marca, modelo, velocidad);
        this.combusCoche = TipoCombustibe.Electrico;
    }

    public TipoCombustibe tipoCombustible(TipoCombustibe combusCoche) {

        return this.combusCoche;
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
