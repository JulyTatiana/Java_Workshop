package com.exercise16;

import java.util.Scanner;

public class ComunicacionUsuario {

    //Se pide por teclado el nombre, la edad, sexo, peso y estatura
    public static String ingresoNombre(Scanner captura){
        String nombre=" ";
        System.out.println("Por favor escriba el nombre: ");
        nombre= captura.nextLine();
        return nombre;
    };
    public static Integer ingresoEdad(Scanner captura){
        Integer edad=0;
        System.out.println("Por favor escriba la edad: ");
        edad= captura.nextInt();
        return edad;
    };
    public static Character ingresoSexo(Scanner captura){
        Character sexo='H';
        System.out.println("Por favor ingrese el género de la persona: ");
        sexo= captura.next().charAt(0);
        return sexo;
    };
    public static Double ingresoPeso(Scanner captura){
        Double peso=0.0;
        System.out.println("Peso: ");
        peso= Double.parseDouble(captura.next());
        return peso;
    };
    public static Double ingresoEstatura(Scanner captura){
        Double estatura=0.0;
        System.out.println("Altura: ");
        estatura= Double.parseDouble(captura.next());
        System.out.println(" ");
        System.out.println("***** RESULTADOS DE LAS PERSONAS 1,2 Y 3 *****");
        return estatura;
    };

    public static String mensajePesoIdeal(int num){
        if(num==-1){
            return " se encuentra por debajo de su peso ideal ";
        }
        return mensajeSobrepeso(num);
    }

    //Mensajes que muestran una retroalimentación al usuario según datos ingresados
    private static String mensajeSobrepeso(int num) {
        if(num==0){
            return " se encuentra en su peso ideal ";
        }
        return " se encuentra por encima de su peso ideal ";
    }

    public static String mensajeMayorDeEdad(boolean mayorDeEdad){
        if (mayorDeEdad){
            return " es mayor de edad.";
        }else {
            return " es menor de edad.";
        }
    }
}