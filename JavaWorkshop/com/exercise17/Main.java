package com.exercise17;

import com.exercise17.Electrodomesticos;
import com.exercise17.Lavadora;
import com.exercise17.Television;

//Clase ejecutable
public class Main {
    public static void main(String[] args) {
        int valorTelevisores = 0;
        int valorLavadoras = 0;
        int valorOtrosElectrodomesticos = 0;
        int valorTotal = 0;

        System.out.println("Los elementos del arreglo son: ");

        //Arreglo de Electrodomésticos
        Electrodomesticos[]
                electrodomesticos = new Electrodomesticos[10];
                electrodomesticos[0] = new Electrodomesticos();
                electrodomesticos[1] = new Television();
                electrodomesticos[2] = new Lavadora();
                electrodomesticos[3] = new Electrodomesticos(190,20);
                electrodomesticos[4] = new Lavadora(300,95);
                electrodomesticos[5] = new Lavadora(210,68);
                electrodomesticos[6] = new Television(280,15);
                electrodomesticos[7] = new Electrodomesticos(80,"rojo",'F',100);
                electrodomesticos[8] = new Television(0,"azul",'C',15,38,false);
                electrodomesticos[9] = new Lavadora(10,"rojo",'B',80,30);

        //Cálculo de precio final
        for (int i=0 ; i<10 ; i++){
            System.out.println(electrodomesticos[i]);
            if(electrodomesticos[i] instanceof  Television){
                valorOtrosElectrodomesticos = valorOtrosElectrodomesticos + electrodomesticos[i].precioFinal();
                valorTelevisores = valorTelevisores + electrodomesticos[i].precioFinal();
                continue;
            }
            else if(electrodomesticos[i] instanceof  Lavadora){
                valorOtrosElectrodomesticos = valorOtrosElectrodomesticos + electrodomesticos[i].precioFinal();
                valorLavadoras = valorLavadoras + electrodomesticos[i].precioFinal();
                continue;
            }
            valorOtrosElectrodomesticos = valorOtrosElectrodomesticos + electrodomesticos[i].precioFinal();
            valorTotal = valorLavadoras + valorTelevisores + valorOtrosElectrodomesticos;
        }

        System.out.println(" ");
        System.out.println("A continución el valor total de la suma de todos los aparatos electrónicos por categoría");
        System.out.println("Lavadoras: "+valorLavadoras);
        System.out.println("Televisores: "+valorTelevisores);
        System.out.println("Electrodomésticos: "+valorOtrosElectrodomesticos);
        System.out.println(" ");
        System.out.println("VALOR TOTAL (suma de las 3 categorías anteriores): "+valorTotal);
    }
}
