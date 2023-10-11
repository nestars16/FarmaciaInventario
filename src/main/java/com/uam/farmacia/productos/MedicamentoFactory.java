package com.uam.farmacia.productos;
import com.uam.farmacia.productos.Medicamento;
import java.util.Scanner;

public class MedicamentoFactory{

    public static String getLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Medicamento getMedicamento() {
        System.out.println("Ingrese el nombre del medicamento: ");
        String nombre = getLine();

        System.out.println("Ingrese la cantidad que habrá en existencia: ");
        int cantidadExistente = 0;
        {
            Scanner in = new Scanner(System.in);
            cantidadExistente = in.nextInt();
            in.close();
        }

        return new Medicamento(nombre,cantidadExistente);
    }
}
