package com.ejercicio17;

public class Electrodomestico {

    private Double precioBase = 100.0;
    private String color = "blanco";
    private Character consumoEnergetico = 'F';
    private Double peso = 5.0;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    protected Character comprobarConsumoEnergetico(Character letra) {
        letra = Character.toUpperCase(letra);
        if (this.consumoEnergetico == letra) {
            return letra;
        } else {
            return this.consumoEnergetico;
        }
    }

    protected Boolean comprobarColor(String color) {
        Boolean isColor = false;
        String coloresDisponibles [] = new String[5];
        coloresDisponibles [0] = "blanco";
        coloresDisponibles [1] = "negro";
        coloresDisponibles [2] = "rojo";
        coloresDisponibles [3] = "azul";
        coloresDisponibles [4] = "gris";

        for (String elementos: coloresDisponibles) {
            isColor = elementos == color?true:false;
        }
        return isColor;
    }

    protected Double precioFinal() {
        double precioFinal = precioAdicionalConsumo() + precioAdicionalPeso() + precioBase;
        return precioFinal;
    }
    private Double precioAdicionalConsumo() {
        Double precioAdicional = 0.0;
        switch (this.consumoEnergetico) {
            case 'A':
                precioAdicional = 100.0;
                break;
            case 'B':
                precioAdicional = 80.0;
                break;
            case 'C':
                precioAdicional = 60.0;
                break;
            case 'D':
                precioAdicional = 50.0;
                break;
            case 'E':
                precioAdicional = 30.0;
                break;
            case 'F':
                precioAdicional = 10.0;
                break;
            default:
                System.out.println("El consumo energético debe de ser entre A y F!!!");
                break;
        }
        return precioAdicional;
    }
    private Double precioAdicionalPeso() {
        Double precioAdicional = 0.0;
        if (this.peso > 80.0) {
            precioAdicional = 100.0;
        } else if (this.peso >= 50.0 && this.peso <= 79.0) {
            precioAdicional = 80.0;
        } else if (this.peso >= 20.0 && this.peso <= 49.0) {
            precioAdicional = 50.0;
        } else if (this.peso >= 0.0 && this.peso <= 19.0) {
            precioAdicional = 10.0;
        } else {
            precioAdicional = 0.0;
        }
        return precioAdicional;
    }
}

