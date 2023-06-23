package org.example.entidades;


import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Embarcacion> embarcaciones;

    public Empresa() {
        embarcaciones = new ArrayList<>();
    }

    public void agregarEmbarcacion(Embarcacion embarcacion) {
        embarcaciones.add(embarcacion);
    }

    public void mostrarMontoAlquilerEmbarcaciones() {
        for (Embarcacion embarcacion : embarcaciones) {
            double montoAlquiler = embarcacion.calcularMontoAlquiler();
            System.out.println("Monto de alquiler: " + montoAlquiler);
        }
    }

    public void mostrarDatos(){
        for (Embarcacion embarcacion: embarcaciones) {
            embarcacion.mostrarInformacion();
        }
    }
}
