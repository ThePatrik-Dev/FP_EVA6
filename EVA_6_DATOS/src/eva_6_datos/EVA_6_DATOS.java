/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_6_datos;

import java.util.Scanner;

/**
 *
 * @author elmas
 */
public class EVA_6_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Alderete Aguirre Diego Joel      
        
        String Nombre;
        String Apellido;
        String CURP;
        int Edad;
        float Promedio;
        Scanner Captura;
        
        Captura = new Scanner(System.in);
        System.out.println("Introduce tus Nombre; ");
        Nombre = Captura.nextLine();
        System.out.println("Introduce tus Apellido; ");
        Apellido = Captura.nextLine();
        System.out.println("Introduce tu CURP; ");
        CURP = Captura.nextLine();
        System.out.println("Introduce tu Edad; ");
        Edad = Captura.nextInt();
        System.out.println("Introduce tu Promedio; ");
        Promedio = (float) Captura.nextFloat();
        
        System.out.println("----------------------------------");
        System.out.println("Datos Capturados");
        System.out.println(Nombre);
        System.out.println(Apellido);
        System.out.println(CURP);
        System.out.println(Edad);
        System.out.println(Promedio);

        
        
    }
    
}
