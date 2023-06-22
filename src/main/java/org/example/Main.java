package org.example;

import org.example.entidades.*;

public class Main {
    public static void main(String[] args) {
        Capitan capitan = new Capitan("Mateo", "Ospina", "12345");

        Embarcacion velero = new Velero(capitan, 1000.0, 20000.0, 2022, 10.0, 5);
        Embarcacion yate = new Yate(capitan, 2000.0, 30000.0, 2023, 15.0, 8);

        Empresa empresa = new Empresa();
        empresa.agregarEmbarcacion(velero);
        empresa.agregarEmbarcacion(yate);

        empresa.mostrarMontoAlquilerEmbarcaciones();
    }
}