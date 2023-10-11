package com.uam.farmacia;
import com.uam.farmacia.productos.*;
import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        Inventario inv = new Inventario(); 
        boolean exit = false;
        
        while(exit != true) {
            System.out.println(inv);
            Inventario.printOptions(); 
            int option = 0;
    
            {
                Scanner in = new Scanner(System.in);
                option = in.nextInt();
                in.close();
            }

            switch(option) {
                case 1:
                    Medicamento toAdd = MedicamentoFactory.getMedicamento(); 
                    inv.addProduct(toAdd);
                    break;
                case 2: {
                    int index = Inventario.getInteger("Ingrese el indice al que desea agregar: ");
                    int quant = Inventario.getInteger("Ingrese la cantidad que desea agregar: ");
                    inv.addToProduct(index,quant);
                }
                    break;
                case 3:
                    int index = Inventario.getInteger("Ingrese el indice al que desea restar: ");
                    int quant = Inventario.getInteger("Ingrese la cantidad que desea restar: ");
                    inv.removeFromProduct(index,quant);
                    break;
                case 4: 
                    exit = true;
                    break;
            }
        }

    }

}
