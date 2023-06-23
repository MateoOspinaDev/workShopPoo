package org.example.entidades;

public class Yate extends Embarcacion implements Lujo{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public String esLujoso() {
        if(cantidadCamarotes > 7) return "Es lujoso";
        return "No es lujoso";
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }
}
