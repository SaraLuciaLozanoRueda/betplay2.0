/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.tarea.betplay2.opciones;

import com.sara.tarea.betplay2.equipo.Equipo;
import com.sara.tarea.betplay2.partidos.Partidos;
import com.sara.tarea.betplay2.persona.Jugador;
import com.sara.tarea.betplay2.persona.Medico;
import com.sara.tarea.betplay2.persona.Tecnico;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author camper
 */
public class Opcion {

    public List<Equipo> equipos;
    public List<Tecnico> equipoT;
    public List<Medico> equipoM;
    public List<Jugador> jugadores;
    public List<Partidos> partido;

    public Opcion() {
        this.equipos = new ArrayList<>();
        this.equipoT = new ArrayList<>();
        this.equipoM = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.partido = new ArrayList<>();
    }

    //Mneu principal Opcion1 menu 2 Opcion1 
    public void op11(String nombreE) {
        if (!existsE(nombreE)) {
            equipos.add(new Equipo(nombreE, 0, 0, 0, 0, 0, 0));
        } else {
            System.out.println("Este equipo ya fue registrado...");
        }
    }

    //MENU PRINCIPAL OPCION1 MENU2 OPCION2
    public void op12(String nombreE, String nombre, String apellido, String rol, String nacionalidad, int numeroFede) {
        Tecnico Tec = new Tecnico(nombreE, nombre, apellido, rol, nacionalidad, numeroFede);
        equipoT.add(Tec);
    }

    //MENU PRINCIPAL OPCION 1 MENU2 OPCION3
    public void op13(String nombreE, String nombre, String apellido, String rol, String nacionalidad, int anyosExperiencia) {
        Medico Med = new Medico(nombreE, nombre, apellido, rol, nacionalidad, anyosExperiencia);
        equipoM.add(Med);
    }

    //MENU PRINCIPAL OPCION 1 MENU2 OPCION4
    public void op14(String nombre, String apellido, String rol, String nacionalidad, int numeroC, int amarillas, int rojas) {
        Jugador juga;
        juga = new Jugador(nombre, apellido, rol, nacionalidad, numeroC, amarillas, rojas);
        jugadores.add(juga);

    }

    public boolean existsE(String nombreE) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombreE().equals(nombreE)) {
                return true;
            }
        }
        return false;
    }

    //OPCION2 REGISTRO DE FECHAS 
    public void opcion2(String fecha, int marc1, int marc2) {
        Partidos par = new Partidos(fecha, marc1, marc2);
        partido.add(par);
    }

    public Equipo Encontrar(String nombreE) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombreE().equals(nombreE)) {
                return equipo;
            }
        }
        return null;
    }
    
    
    //NENU PRINCIPAL OPCION 3 MENU D 1
    public void op31(){
            
    }
    
    //NENU PRINCIPAL OPCION 3 MENU D 5
    public void op35() {
        Collections.sort(equipos, (equipo1, equipo2) -> equipo2.getTP() - equipo1.getTP());

        System.out.println("Tabla de posiciones:");
        for (int i = 0; i < equipos.size(); i++) {
            Equipo equipo = equipos.get(i);
            System.out.println(MessageFormat.format("\n{0}. {1}\nPartidos jugados: {2}\nPartidos ganados: {3}\nPartidos perdidos: {4}\nPartidos empatados: {5}\nGoles a favor: {6}\nGoles en contra: {7}\nTotal de puntos: {8}",i + 1,equipo.getNombreE(),equipo.getPJ(),equipo.getPG(),equipo.getPP(),equipo.getPE(),equipo.getGF(),equipo.getGC(),equipo.getTP()));
        }
    }
    //MENU PRINCIAPL OPCION3 MENU2 OPCION6
    public void op36(){
        System.out.println("Cuerpo Tecnico");
        
        equipoT.forEach(et ->{
            System.out.println(MessageFormat.format("\nNombre: {0}\nApellido: {1}\nRol: {2}\nNacionalidad: {3}\nNumero federacion: {4}", et.getNombre(),et.getApellido(),et.getRol(),et.getNacionalidad(),et.getNumeroFede()));
        });
        
    }

}
