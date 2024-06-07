/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.tarea.betplay2.persona;

/**
 *
 * @author camper
 */
public class Jugador extends Persona{
    int numeroC;
    int amarillas;
    int rojas;

    public Jugador(String nombre, String apellido, String rol, String nacionalidad, int numeroC,int amarillas,int rojas) {
        super(nombre, apellido, rol, nacionalidad);
        this.numeroC = numeroC;
        this.amarillas = amarillas;
        this.rojas = rojas;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public int getRojas() {
        return rojas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }


    
    
}
