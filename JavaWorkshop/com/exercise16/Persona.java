package com.exercise16;

public class Persona {
    private String nombre ="";
    private int edad =0;
    private String DNI;
    private char sexo = 'H';
    private double peso =0;
    private double altura =0;

    private boolean esMayorDeEdad;

    public Persona() {
        calcularletra();
    }
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        calcularletra();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        calcularletra();
    }

    public final double IMC() {
        double IMC = this.peso / (Math.pow(this.altura,2));
        return IMC;
    }
    public final int calcularIMC() {
        int result =0;
        if (IMC() < 20) {
            result = -1;
        } else if (IMC() <= 25 && IMC() >= 20 ) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }

    public boolean esMayorDeEdad() {
        return this.edad>18?true:false;
    }

    protected char comprobarSexo() {
        this.sexo = Character.toUpperCase(sexo);
        if (this.sexo == 'M') {
            return this.sexo = 'M';
        } else {
            return  this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return "\nDatos de la persona: \nNombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + calcularletra() + "\nsexo: " + sexo +
                "\npeso(kg): " + peso + "\naltura(m): " + altura +"\nIMC(kg/m^2): " + IMC();
    }
    protected int generaDNI() {
        double eightDigits = 10000000 + Math.random() * 90000000;
        return (int) eightDigits;
    }
    protected String calcularletra() {
        int eightDigits = generaDNI();
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = eightDigits%23;
        char letra = caracteres.charAt(resto);
        String DNI = String.valueOf(eightDigits) + String.valueOf(letra);
        return DNI;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public int setEdad(int edad) {
        this.edad = edad;
        return edad;
    }

    public char setSexo(char sexo) {
        this.sexo = sexo;
        return sexo;
    }

    public double setPeso(double peso) {
        this.peso = peso;
        return peso;
    }

    public double setAltura(double altura) {
        this.altura = altura;
        return altura;
    }


}
