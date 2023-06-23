package org.example.entidades;

public class Velero extends Embarcacion implements Grande {
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public String esGrande() {
        if (cantidadMastiles > 4) return "Es grande";
        return "No es grande";
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }


}
