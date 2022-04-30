package com.exercise16;

import java.util.Scanner;

public class Main {
    static String nombre;
    static int edad;
    static char sexo;
    static double peso;
    static double altura;
    static boolean esMayorDeEdad;
    public static void solicitarInformacion() {
        Scanner entry = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = entry.nextLine();
        System.out.print("Edad: ");
        edad = entry.nextInt();
        System.out.print("Sexo: ");
        sexo = Character.toUpperCase(entry.next().charAt(0));
        System.out.print("Peso: ");
        peso = Double.parseDouble(scanner.nextLine());
        System.out.print("Altura: ");
        altura = Double.parseDouble(scanner.nextLine());
    }
    public static void indiceMasaCorporal(Persona persona) {
        int IMC = persona.calcularIMC();
        switch (IMC) {
            case -1:
                System.out.println("¡Está por debajo de su peso ideal!");
                break;
            case 0:
                System.out.println("¡Se encuentra en el peso ideal!");
                break;
            case 1:
                System.out.println("¡Tiene sobrepeso!");
                break;
        }
    }
    public static void mayoriaEdad (Persona persona) {
        if (persona.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public static void main(String[] args) {

        System.out.println("***************************************************");
        System.out.println("******* Información de la primera persona *********");
        System.out.println("***************************************************");
        solicitarInformacion();
        Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
        System.out.println(p1);
        indiceMasaCorporal(p1);
        mayoriaEdad(p1);

        System.out.println("***************************************************");
        System.out.println("******* Información de la segunda persona *********");
        System.out.println("***************************************************");
        Persona p2 = new Persona("Juan", 30, 'H');
        p2.setPeso(30);
        p2.setAltura(1.2);
        System.out.println(p2);
        indiceMasaCorporal(p2);
        mayoriaEdad(p2);

        System.out.println("***************************************************");
        System.out.println("******* Información de la tercera persona *********");
        System.out.println("***************************************************");
        Persona p3 = new Persona();
        p3.setNombre("Pablo");
        p3.setEdad(4);
        p3.setSexo('M');
        p3.setPeso(30);
        p3.setAltura(1.80);
        System.out.println(p3);
        indiceMasaCorporal(p3);
        mayoriaEdad(p3);
        System.out.println("***************************************************");
    }
}
