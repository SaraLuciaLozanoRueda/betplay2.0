/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.tarea.betplay2.persona;

/**
 *
 * @author camper
 */
public class Tecnico extends Persona{
    int numeroFede;

    public Tecnico( String nombre, String apellido, String rol, String nacionalidad, String nacionalidad1, int numeroFede) {
        super(nombre, apellido, rol, nacionalidad);
        this.numeroFede = numeroFede;
    }

    public int getNumeroFede() {
        return numeroFede;
    }

    public void setNumeroFede(int numeroFede) {
        this.numeroFede = numeroFede;
    }
    
    
    
}
