package com.uam.farmacia.productos;
import com.uam.farmacia.productos.Medicamento;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    ArrayList<Medicamento> almacen = new ArrayList<Medicamento>();

    public Inventario() {}

    @Override
    public String toString() {

        String self = "\t\tSistema de Inventario\n\nMedicamentos disponibles\n\n";

        int counter = 0;
        for(Medicamento item : almacen) {
            self += ++counter + "-" + item + "\n";
        }

        return self;
    }

    public void addProduct(Medicamento toAdd) {
        almacen.add(toAdd);
    }

    public void addToProduct(int index, int quantity) {
        if(index < 0 || index >= almacen.size() || almacen.isEmpty()) {
            System.out.println("Indice no valido o  no existen medicamentos");
            return;
        }

        almacen.get(index).increaseExistance(quantity);
    }

    public void removeFromProduct(int index, int quantity) {
        if(index < 0 || index >= almacen.size() || almacen.isEmpty()) {
            System.out.println("Indice no valido o no existen medicamentos");
            return;
        }

        almacen.get(index).decreaseExistance(quantity);
    }

    public static void printOptions() {
        System.out.println("1. Agregar medicamento");
        System.out.println("2. Agregar a medicamento existente");
        System.out.println("3. Restar existencia a medicamento");
        System.out.println("4. salir");
    }

    public static int getInteger(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        int number = in.nextInt();
        in.close();
        return number;
    }
}
