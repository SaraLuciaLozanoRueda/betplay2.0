/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.tarea.betplay2.persona;

/**
 *
 * @author camper
 */
public class Medico extends Persona{
    int anyosExperiencia;

    public Medico( String nombre, String apellido, String rol, String nacionalidad, String nacionalidad1, int anyosExperiencia) {
        super(nombre, apellido, rol, nacionalidad);
        this.anyosExperiencia = anyosExperiencia;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }
    
    
}
