package com.exercise17;

//Subclase Television
public class Television extends Electrodomesticos {

    Integer resolucion;
    Boolean sintonizadorTDT;

    //Constructor por defecto
    public Television(){
        super();
        resolucion = 20;
        sintonizadorTDT = false;
    }

    //Constructor con el precio y peso. El resto por defecto
    public Television(int precioInicial, int peso){
        super(precioInicial,peso);
        resolucion = 20;
        sintonizadorTDT = false;
    }

    //Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
    public Television(int precioInicial, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT){
        super(precioInicial,color,consumoEnergetico,peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Método get de resolución
    public Integer getResolucion() {
        return resolucion;
    }
    
    //Método get sintonizador TDT
    public Boolean getsintonizadorTDT() {
        return sintonizadorTDT;
    }

    //Método precio final
    public Integer precioFinal(){
        if (resolucion>40){
            return((int) Math.ceil(this.precioInicial + precioConsumo() + precioPeso() + precioPorTDT() * 1.3));
        }
        return(this.precioInicial + precioConsumo() + precioPeso() + precioPorTDT());
    }
    protected Integer precioPorTDT(){
        if(sintonizadorTDT){
            return 50;
        }
        return 0;
    }
}