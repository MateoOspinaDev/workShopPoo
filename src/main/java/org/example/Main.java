package org.example;

import org.example.entidades.*;


public class Main {
    public static void main(String[] args) {
        Capitan capitan = new Capitan("Mateo", "Ospina", "12345");

        Velero velero1 = new Velero(capitan, 100000, 2022, 10.0, 5);
        Yate yate1 = new Yate(capitan, 200000, 2023, 15.0, 8);
        Velero velero2 = new Velero(capitan, 100000, 2019, 10.0, 2);
        Yate yate2 = new Yate(capitan, 200000, 2017, 15.0, 5);

        Empresa empresa = new Empresa();
        empresa.agregarEmbarcacion(velero1);
        empresa.agregarEmbarcacion(yate1);
        empresa.agregarEmbarcacion(velero2);
        empresa.agregarEmbarcacion(yate2);

        System.out.println(velero1.esGrande());
        System.out.println(yate1.esLujoso());
        System.out.println(yate1.calcularMontoAlquiler());
        System.out.println(velero1.calcularMontoAlquiler());

        System.out.println(velero2.esGrande());
        System.out.println(yate2.esLujoso());
        System.out.println(yate2.calcularMontoAlquiler());
        System.out.println(velero2.calcularMontoAlquiler());
        empresa.mostrarDatos();
    }
}