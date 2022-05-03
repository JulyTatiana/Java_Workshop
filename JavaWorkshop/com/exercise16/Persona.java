package com.exercise16;

import java.util.Random;

//Clase Persona
public class Persona {
    private String nombre;
    private Integer edad;
    private Character sexo;
    private Double peso;
    private Double estatura;
    private String DNI;

    //constructor por defecto
    public Persona() {
        this.nombre = " ";
        this.edad = 0;
        this.sexo = 'M';
        this.peso = 0.0;
        this.estatura = 0.0;
        this.DNI = generaDNI(numeroDNI());
    }

    //Constructor con el nombre, edad y sexo, y el resto por defecto
    public Persona(String nombre, Integer edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0.0;
        this.estatura = 0.0;
        this.DNI = generaDNI(numeroDNI());
    }

    //Constructor con todos los atributos como parámetro
    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.DNI = generaDNI(numeroDNI());
    }

    //IMC
    public static Integer calcularIMC(Integer indice) {
        if (indice < 20) {
            return -1;
        }
        return calcularSobrepeso(indice);
    };
    public static Integer calcularMC(Double peso, Double estatura) {
        return calcularIMC((int) (peso / (estatura * estatura)));

    };
    public static Integer calcularSobrepeso(Integer indice) {
        if (25 < indice) {
            return 1;
        }
        return 0;
    };

    //Edad
    public Boolean esMayorDeEdad(Integer edad) {

        return (18 <= edad);
    };

    //Comprobar Sexo
    public static Character comprobarMujer(Character sexo) {
        if (sexo == 'M') {
            return 'M';
        }
        return 'H';
    }
    public static Character comprobarSexo(Character sexo) {
        if (sexo == 'H') {
            return 'H';
        }
        return comprobarMujer(sexo);
    }

    //Info Objeto
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", estatura=" + estatura +
                '}';
    }

    //Generación de DNI
    public Integer numeroDNI() {
        Random rnd = new Random();
        int number = rnd.nextInt(100000000);

        return number;
    };
    public String generaDNI(Integer num) {
        Integer letraDNI = num % 24;
        String listaLetras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String valorDNI = String.valueOf(num) + listaLetras.charAt(letraDNI);
        return valorDNI;
    };

    //Métodos Set de cada parámetro, excepto DNI
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public Double getEstatura() {
        return estatura;
    }
    public Double getPeso() {
        return peso;
    }
}