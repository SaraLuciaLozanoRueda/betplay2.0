/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.tarea.betplay2.partidos;

/**
 *
 * @author camper
 */
public class Partidos {

    String fecha;
    int marc1;
    int marc2;
    
    public Partidos() {
    }

    public Partidos(String fecha, int marc1, int marc2) {
        this.fecha = fecha;
        this.marc1 = marc1;
        this.marc2 = marc2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMarc1() {
        return marc1;
    }

    public void setMarc1(int marc1) {
        this.marc1 = marc1;
    }

    public int getMarc2() {
        return marc2;
    }

    public void setMarc2(int marc2) {
        this.marc2 = marc2;
    }

}
