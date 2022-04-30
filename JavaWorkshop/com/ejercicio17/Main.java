package com.ejercicio17;

public class Main {
    public static void main(String[] args) {

        Electrodomestico e1 = new Electrodomestico(500.0, "blanco", 'A',200.0);
        Electrodomestico e2 = new Electrodomestico(1000.0, "azul", 'F',500.0);
        Electrodomestico e3 = new Electrodomestico(150.0, "negro", 'C',200.0);
        Electrodomestico e4 = new Electrodomestico(10.0, "rojo", 'B',1.0);
        Lavadora l1 = new Lavadora(2000.0,"gris", 'E', 22.0, 40.0);
        Lavadora l2 = new Lavadora(5000.0,"azul", 'C', 32.0, 10.0);
        Lavadora l3 = new Lavadora(6000.0,"negro", 'D', 92.0, 40.0);
        Television t1 = new Television(3000.0, "gris", 'A', 150.0, 21.0, false);
        Television t2 = new Television(12000.0, "negro", 'B', 87.0, 71.0, true);
        Television t3 = new Television(9000.0, "gris", 'F', 88.0, 50.0, true);


        Double arrayElectrodomestico [] = new Double [10];

        arrayElectrodomestico[0] = e1.precioFinal();
        arrayElectrodomestico[1] = e2.precioFinal();
        arrayElectrodomestico[2] = e3.precioFinal();
        arrayElectrodomestico[3] = e4.precioFinal();
        arrayElectrodomestico[4] = l1.precioFinal();
        arrayElectrodomestico[5] = l2.precioFinal();
        arrayElectrodomestico[6] = l3.precioFinal();
        arrayElectrodomestico[7] = t1.precioFinal();
        arrayElectrodomestico[8] = t2.precioFinal();
        arrayElectrodomestico[9] = t3.precioFinal();

        Double sumaOtrosElectrodomesticos = 0.0;
        for (int i = 0; i < 4 ; i++) {
            sumaOtrosElectrodomesticos+=  arrayElectrodomestico[i];
        }
        System.out.println("Suma de otros electrodomesticos: " + sumaOtrosElectrodomesticos);

        Double sumaLavadoras = 0.0;
        for (int i = 4; i < 7 ; i++) {
            sumaLavadoras+=  arrayElectrodomestico[i];
        }
        System.out.println("Suma lavadoras: " + sumaLavadoras);

        Double sumaTelevisores = 0.0;
        for (int i = 7; i < 10 ; i++) {
            sumaTelevisores+=  arrayElectrodomestico[i];
        }
        System.out.println("Suma televisores " + sumaTelevisores);
        Double totalElectrodomesticos = sumaOtrosElectrodomesticos + sumaLavadoras + sumaTelevisores;
        System.out.println("Suma total de electrodomesticos: " + totalElectrodomesticos);

    }
}
