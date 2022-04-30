package com.ejercicio17;

public class Television extends Electrodomestico{

    Double resolucion = 20.0;
    Boolean sintonizadorTDT = false;

    public Television () {

    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Double resolucion, Boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public Double precioFinal() {
        return super.precioFinal() + precioAdicionalResolucion() + precioAdicionalSintonizadorTDT();
    }

    private Double precioAdicionalResolucion() {
        Double precioAdicional = 0.0;
        if (getResolucion() > 40.0) {
            precioAdicional = precioAdicional + 30/100;
        }
        return precioAdicional;
    }

    private Double precioAdicionalSintonizadorTDT() {
        Double precioAdicional = 0.0;
        if (isSintonizadorTDT() == true) {
            precioAdicional = 50.0;
        }
        return precioAdicional;
    }
}
