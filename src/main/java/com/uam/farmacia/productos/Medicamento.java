package com.uam.farmacia.productos;

public class Medicamento{
    private String nombre;
    private int cantidadExistente;

    Medicamento(String nombre, int cantidadExistente) {
        this.nombre = nombre;
        this.cantidadExistente = cantidadExistente;

        if(this.cantidadExistente < 0) {
            System.out.println("No se permiten cantidades negativas en cantidades");
            cantidadExistente = 0;
        }
    }

    @Override
    public String toString() {
        return nombre + " -- " + cantidadExistente;
    }

    public void decreaseExistance(int productLeaving) {
        if(productLeaving < 0) {
            System.out.println("No se permiten cantidades negativas en este parametro");
            return;
        }
        cantidadExistente -= productLeaving;
    }

    public void increaseExistance(int productEntering) {
        if(productEntering < 0) {
            System.out.println("No se permiten cantidades negativas en este parametro");
            return;
        }
        cantidadExistente += productEntering;
    }
}

