package com.exercise16;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//Clase ejecutable
public class Main {
    public static void main(String[] args) {

        //Se pide nombre, edad, sexo y estatura:
        List<Persona> listaPersonas = new ArrayList<>();
        Scanner captura=new Scanner(System.in);
        String nombre= ComunicacionUsuario.ingresoNombre(captura);
        Integer edad= ComunicacionUsuario.ingresoEdad(captura);
        Character sexo= ComunicacionUsuario.ingresoSexo(captura);
        sexo=Persona.comprobarSexo(sexo);
        Double peso= ComunicacionUsuario.ingresoPeso(captura);
        Double estatura= ComunicacionUsuario.ingresoEstatura(captura);

        //Objeto #1 (Persona con las variables pedidas por teclado)
        Persona persona1=new Persona(nombre,edad,sexo,peso,estatura);
        listaPersonas.add(persona1);

        //Objeto #2
        Persona persona2= new Persona(nombre, edad, sexo);
        persona2.setPeso(65.0);
        persona2.setEstatura(1.70);
        listaPersonas.add(persona2);

        //Objeto #3
        Persona persona3=new Persona();
        persona3.setNombre("Jack");
        persona3.setEdad(31);
        persona3.setSexo('m');
        persona3.setPeso(65.0);
        persona3.setEstatura(1.69);
        listaPersonas.add(persona3);
        for (Persona persona : listaPersonas){
            System.out.println(" ");
            Integer pesoIndice=persona.calcularMC(persona.getPeso(),persona.getEstatura());
            Boolean esMayor=persona.esMayorDeEdad(persona.getEdad());
            System.out.println(persona.getNombre()+ ComunicacionUsuario.mensajePesoIdeal(pesoIndice) + "y" + ComunicacionUsuario.mensajeMayorDeEdad(esMayor));
            System.out.println(persona.toString());
        };
    }
}
