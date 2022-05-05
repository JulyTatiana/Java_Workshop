package com.exercise17;

//Subclase Lavadora
public class Lavadora extends Electrodomesticos {
    Integer carga;
    
    //Constructor por defecto
    public Lavadora(){
        super();
        carga = 5;
    }
    
    //Constructor con el precio y peso. El resto por defecto.
    public Lavadora(int precioInicial, int peso){
        super(precioInicial,peso);
        carga = 5;
    }
    
    //Constructor con la carga y el resto de atributos heredados de Electrodomésticos
    public Lavadora(int precioInicial, String color, char consumoEnergetico, int peso, int carga){
        super(precioInicial, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    //Método get de carga
    public int getCarga() {
        return carga;
    }
    
    //Método precio Final
    public Integer precioFinal(){
        return(this.precioInicial + precioConsumo() + precioPeso() + precioCarga());
    }
    protected Integer precioCarga(){
        int precioCarga = 0;
        if(carga>30){
            precioCarga = 50;
        }
        return precioCarga;
    }
}