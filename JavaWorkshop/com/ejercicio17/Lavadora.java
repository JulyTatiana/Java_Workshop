package com.ejercicio17;

public class Lavadora extends Electrodomestico{

    Electrodomestico e = new Electrodomestico();

    Double carga = 5.0;

    public Lavadora() {
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public Double precioFinal() {
        return super.precioFinal() + precioAdicionalCarga();
    }

    private Double precioAdicionalCarga() {
        Double precioAdicional = 0.0;
        if (getCarga() > 30.0) {
            precioAdicional = 50.0;
        }
        return precioAdicional;
    }
}
