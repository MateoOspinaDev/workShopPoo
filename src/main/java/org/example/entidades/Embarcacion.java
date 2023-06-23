package org.example.entidades;

public class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional = 20000;
    private int anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler() {
        double montoAlquiler = precioBase;
        if (anioFabricacion > 2020) {
            montoAlquiler += valorAdicional;
        }
        return montoAlquiler;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }


    public void mostrarInformacion() {
        System.out.println("la informacion del capitan es: \n");
        capitan.toString();
        System.out.println("\nEl precio del alquiler de la embarcacion es: $"+this.calcularMontoAlquiler());
        System.out.println("El año de fabricacion de la embarcacion es: "+anioFabricacion);
        System.out.println("El tamaño de la embarcacion es "+eslora+" m");

    }
}
