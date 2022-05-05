package com.exercise17;

//Superclase Electrodomesticos
public class Electrodomesticos {

    //Tipo de constantes atributos
    String color;
    Character consumoEnergetico;
    final Integer peso;
    final Integer precioInicial;

    //Constructor por defecto (atributos constantes por defecto)
    public Electrodomesticos() {
        peso = 5;
        precioInicial = 100;
        consumoEnergetico = 'F';
        color = "blanco";
    }

    //Constructor con precio y peso, el resto de atributos por defecto
    public Electrodomesticos(int precioInicial, int peso) {
        this.peso = peso;
        this.precioInicial = precioInicial;
        consumoEnergetico = 'F';
        color = "blanco";
    }

    //Constructor con todos los atributos
    public Electrodomesticos(int precioInicial, String color, char consumoEnergetico, int peso) {
        this.peso = peso;
        this.precioInicial = precioInicial;
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
        comprobarColor(color);
        comprobarConsumoEnergetico(this.consumoEnergetico);
    }

    //*****MÉTODOS*****

    //Métodos get de todos los atributos:
    public Integer getprecioInicial() {
        return precioInicial;
    }
    public String getColor() {
        return color;
    }
    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public Integer getPeso() {
        return peso;
    }

    //Método Consumo energético
    private void comprobarConsumoEnergetico(char letra){
        switch (letra){
            case 'A':
            case 'a':{
                this.consumoEnergetico = 'A';
                break;
            }
            case 'B':
            case 'b':{
                this.consumoEnergetico = 'B';
                break;
            }
            case 'C':
            case 'c':{
                this.consumoEnergetico = 'C';
                break;
            }
            case 'D':
            case 'd':{
                this.consumoEnergetico = 'D';
                break;
            }
            case 'E':
            case 'e':{
                this.consumoEnergetico = 'E';
                break;
            }
            case 'F':
            case 'f':{
                this.consumoEnergetico = 'F';
                break;
            }
            default:
                this.consumoEnergetico = 'F';
                break;
        }
    }

    //Método que comprueba que el color es correcto, sino usa color por defecto
    private void comprobarColor(String color){
        String comprobarcolor = color.toLowerCase();
        switch (comprobarcolor){
            case "blanco":{
                this.color = "blanco";
                break;
            }
            case "negro":{
                this.color = "negro";
                break;
            }
            case "rojo":{
                this.color = "rojo";
                break;
            }
            case "azul":{
                this.color = "azul";
                break;
            }
            case "gris":{
                this.color = "gris";
                break;
            }
            default:
                this.color = "blanco";
        }
    }

    //Método precio final
    public Integer precioFinal(){
        return(this.precioInicial+precioConsumo()+precioPeso());
    }

    //Calculo de precio final
    protected Integer precioConsumo(){
        int precioConsumo = 0;
        switch(this.consumoEnergetico){
            case 'A':{
                precioConsumo = 100;
                break;
            }
            case 'B':{
                precioConsumo = 80;
                break;
            }
            case 'C':{
                precioConsumo = 60;
                break;
            }
            case 'D':{
                precioConsumo = 50;
                break;
            }
            case 'E':{
                precioConsumo = 30;
                break;
            }
            case 'F':{
                precioConsumo = 10;
                break;
            }
        }
        return precioConsumo;
    }

    protected Integer precioPeso(){
        int precioPeso = 0;
        if(this.peso<20){
            precioPeso = 10;
        }else if (20<=this.peso && this.peso<50){
            precioPeso = 50;
        }else if (50<=this.peso && this.peso<80){
            precioPeso = 80;
        }else if (80<=this.peso) {
            precioPeso = 100;
        }
        return precioPeso;
    }
}