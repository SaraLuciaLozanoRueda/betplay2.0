/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.tarea.betplay2.menu;

import com.sara.tarea.betplay2.equipo.Equipo;
import com.sara.tarea.betplay2.opciones.Opcion;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class menu {

    public static void menu() {
        Opcion op = new Opcion();
        Scanner sc = new Scanner(System.in);
        int rta;
        do {
            System.out.println("");
            System.out.println("-   MENU DE OPCIONES   -");
            System.out.println("");
            System.out.println("1. Registros \n2. Registro de fecha\n3. Reportes\n4. Salir\n\nIngresa la selección");
            rta = sc.nextInt();

            switch (rta) {
                case 1 -> {
                    int opcion;
                    System.out.println("REGISTROS");
                    System.out.println("1. Registra Equipo\n2. Registra Cuerpo tecnico\n3. Registra Equipo Medico\n4. Registro Jugadores\n\nElige una opcion: ");
                    opcion = sc.nextInt();

                    switch (opcion) {

                        case 1 -> {

                            System.out.println("Equipo");
                            System.out.println("Registre el nombre del equipo: ");
                            String ne = sc.next();
                            op.op11(ne);
                        }

                        case 2 -> {

                            System.out.println("Tecnico");
                            System.out.println("Nombre del equipo al que pertenece");
                            String noE = sc.next();

                            if (!op.existsE(noE)) {
                                System.out.println("El equipo no existe");
                            } else {
                                System.out.println("Nombre del miembro del equipo tecnico ");
                                String nt = sc.next();//Nombre tecnico = nt
                                System.out.println("Apellido del miembro del equipo tecnico");
                                String at = sc.next();//Apellido tecnico = at
                                System.out.println("Rol del miembro del equipo tecnico");
                                String rt = sc.next();//Rol del tecnico = rt
                                System.out.println("Nacionalidad del miembro del equipo tecnico");
                                String nat = sc.next();//Nacionalidad tecnico = nat
                                System.out.println("Numero de federacion del miembro del equipo tecnico");
                                int nft = sc.nextInt();//federacion tecnico = nft
                                op.op12(noE, nt, at, rt, nat, nft);
                            }

                        }

                        case 3 -> {
                            System.out.println("Medicos");
                            System.out.println("Nombre del equipo al que pertenece");
                            String noe = sc.next();
                            if (!op.existsE(noe)) {
                                System.out.println("El equipo no existe");
                            } else {
                                System.out.println("Nombre del miembro del equipo Medico ");
                                String nm = sc.next();//Nombre medico = nm
                                System.out.println("Apellido del miembro del equipo Medico");
                                String am = sc.next();//Apellido Medico = am
                                System.out.println("Rol del miembro del equipo Medico");
                                String rm = sc.next();//Rol del Medico = rm
                                System.out.println("Nacionalidad del miembro del equipo Medico");
                                String nam = sc.next();//Nacionalidad Medico = nam
                                System.out.println("Numero de años de experiencia del miembro del equipo Medico");
                                int nfm = sc.nextInt();//federacion Medico = nfm
                                op.op13(noe, nm, am, rm, nam, nfm);
                            }

                        }
                        case 4 -> {
                            System.out.println("Jugadores");
                            System.out.println("Nombre del equipo al que pertenece");
                            String eNo = sc.next();
                            if (op.existsE(eNo)) {
                                System.out.println("Equipo no existente");
                            } else {
                                System.out.println("Nombre del jugador");
                                String nj = sc.next();
                                System.out.println("Apellido del jugador");
                                String aj = sc.next();
                                System.out.println("Rol (Posicion) del jugador");
                                String rj = sc.next();
                                System.out.println("Nacionalidad del jugador");
                                String naj = sc.next();
                                System.out.println("Numero de camiseta");
                                int ncj = sc.nextInt();
                                System.out.println("\n\n");
                                System.out.println("FALTAS");
                                System.out.println("Tarjetas amarillas del jugador");
                                int ama = sc.nextInt();
                                System.out.println("Tarjatas rojas del jugador");
                                int ro = sc.nextInt();
                                op.op14(nj, aj, rj, naj, ncj, ama, ro);
                            }

                        }
                        default -> {
                            if (opcion > 3) {
                                System.out.println("Solo opciones validas");
                            }
                        }

                    }
                }

                case 2 -> {
                    System.out.println("Ingrese la fecha del partido (DD/MM/YYYY):");
                    String fecha = sc.next();
                    System.out.println("Nombre del equipo local");
                    String local = sc.next();
                    System.out.println("Nombre del equipo visitante");
                    String visit = sc.next();

                    if (op.existsE(local) && op.existsE(visit)) {
                        System.out.println("Realizando validacion de equipo...");
                        System.out.println("\n\n");
                    } else {
                        if (!op.existsE(local)) {
                            System.out.println("Equipo local no existe");
                            break;
                        }
                        if (!op.existsE(visit)) {
                            System.out.println("Equipo visitante no existente");
                            break;
                        }
                    }

                    System.out.println("Ingrese el marcador del equipo local");
                    int gl = sc.nextInt();
                    System.out.println("Ingrese el marcador del equipo visitante");
                    int gv = sc.nextInt();
                    op.opcion2(fecha, gl, gv);
                 

                    Equipo equipoLocal = op.Encontrar(local);
                    Equipo equipoVisitante = op.Encontrar(visit);
                    if (gl > gv) {

                        equipoLocal.setPJ(+1);
                        equipoLocal.setPG(+1);
                        equipoLocal.setGF(gl);
                        equipoLocal.setGC(gv);
                        equipoLocal.setTP(+3);

                        equipoVisitante.setPP(+1);
                        equipoVisitante.setPJ(+1);
                        equipoVisitante.setGF(gv);
                        equipoVisitante.setGC(gl);

                    } else if (gv > gl) {

                        equipoVisitante.setPJ(+1);
                        equipoVisitante.setPG(+1);
                        equipoVisitante.setGF(gv);
                        equipoVisitante.setGC(gl);
                        equipoVisitante.setTP(+3);

                        equipoLocal.setPP(+1);
                        equipoLocal.setPJ(+1);
                        equipoLocal.setGF(gl);
                        equipoLocal.setGC(gv);

                    } else if (gl == gv) {
                        System.out.println("EMPATE");
                        equipoLocal.setPE(+1);
                        equipoVisitante.setPE(+1);
                        equipoLocal.setTP(+1);
                        equipoVisitante.setTP(+1);
                    }
                }

                case 3 -> {
                    int eleccion;
                    System.out.println("REPORTES");
                    System.out.println("1. Jugador goleador\n2. Jugador con mas tarjetas rojas\n3. Jugador con mas tarjetas amarillas\n4. Jugador * equipos\n5. Tabla de posiciones\n6.Cuerpo Tecnico\n\n Elige una opcion");
                    eleccion = sc.nextInt();

                    switch (eleccion) {
                        case 1 ->
                            System.out.println("Goleador");
                            
                        case 2 ->
                            System.out.println("Rojas");
                        case 3 ->
                            System.out.println("Amarillas");
                        case 4 ->
    
                            System.out.println(" j * e");
                        case 5 ->
                            op.op35();
                        case 6 ->
                            op.op36();
                        default -> {
                            System.out.println("Solo opciones validas");
                        }
                    }
                }

                case 4 -> {
                    System.out.println("Muchas gracias por usar nuestro sistema");
                }
                default -> {
                    if (rta > 4) {
                        System.out.println("Ingresa un numero valido");
                    }
                }
            }

        } while (rta != 4);

    }

}
