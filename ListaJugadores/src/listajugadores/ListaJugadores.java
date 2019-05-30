/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listajugadores;

import java.util.Scanner;
import java.util.escanner;
/**
 *
 * @author Granda
 */
public class ListaJugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String nombre = "";
        String apellido = "";
        int goles = 0;
        int sumagoles = 0;
        int suma = 0;
        double sueldo = 0;
        double promediosueldo = 0;
        boolean bandera = true;
        int contador = 0;
        String valorUsuario;
        String respuesta;
        //Valor inicia de la variable cadena
        cadena = String.format("%s\t\t", cadena,
                "Lista de Jugadores");
        cadena = String.format("%s\t\t\t%s\t\t\t%s\t\t\t%s\n", "Nombre",
                "Apellido", "Goles", "Sueldo");
        //Ciclo Principal
        do{
            contador = contador + 1;
            System.out.printf("Ingrese Nombre del Jugador: ");
            nombre = entrada.nextLine();
                 
            System.out.printf("Ingrese el Apellido del Jugador: ");
            apellido = entrada.nextLine();
            
            System.out.printf("Ingrese la cantidad de Goles: ");
            goles = entrada.nextInt();
            
            System.out.printf("Ingrese el Sueldo del Jugador: ");
            sueldo = entrada.nextInt();
            //Primera concatenacion
            cadena = String.format("%s%s\t\t\t%s\t\t\t%d\t\t\t%.2f\n", cadena, nombre, 
                  apellido, goles, sueldo);
            
            sumagoles = sumagoles + goles;
            entrada.nextLine(); // Limiar buffer
            
            //Condicion que controla la salida del ciclo principal
            System.out.printf("\nIngrese 'si' para --->%s\nIngrese 'no' para --->%s\n"," Nuevo Jugador","Salir");
                       System.out.printf("\nEscriba su respuesta: ");
                      respuesta = entrada.nextLine().toUpperCase();
         
            if (respuesta.equals("no") || respuesta.equals("No") || respuesta.equals("NO"));
            
            promediosueldo = sueldo + promediosueldo;
            
        } while (respuesta.equals("SI") || respuesta.equals ("si") || respuesta.equals ("Si"));
          
          promediosueldo = promediosueldo / 2;
          //Valor final de la variable cadena
          cadena = String.format("%sTotal Goles: %d\nPromedio Sueldo: %.2f\n ", cadena, sumagoles, promediosueldo);
          
          System.out.printf("%s", cadena);
    }
    
}
