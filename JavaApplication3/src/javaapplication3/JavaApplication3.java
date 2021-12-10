/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */


public class JavaApplication3 {
    
    Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        /*System.out.println("ingresa tu nombre: \n");
        String nombre = sc.nextLine();
        System.out.println("hola " + nombre);*/
        int opcion2;
        
        do{
            System.out.println("1.Suma\n");
            System.out.println("2.Resta\n");
            System.out.println("3.Multiplicacion\n");
            System.out.println("4.Division\n");
            System.out.println("5.Salir\n");

            System.out.println("ingresa la opcion de tu preferencia: \n");
            int opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    functions suma = new functions();
                    suma.SumarNumeros();
                    break;
                case 2 :
                    functions resta = new functions();
                    resta.SumarNumeros();

                    break;

                case 3:
                    functions producto = new functions();
                    producto.ProductoNumeros();
                    break;

                case 4:
                    functions division = new functions();
                    division.DivisionNumeros();
                    break;

                case 6 :
                    System.exit(0);
                    break;

                default: 
                    System.out.println("La opcion ingresada es invalida");
                    break;   
            }
            
            System.out.println("\nDesea hacer alguna otra operacion?");
            System.out.println("1.Si\n");
            System.out.println("2.No\n"); 
            opcion2 = sc.nextInt();
        } while (opcion2==1);
    }
    
     
     
     /*public static void RestarNumeros(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese su primer numero: \n");
         int suma1 = sc.nextInt();
         System.out.println("Ingrese su segundo numero: \n");
         int suma2 = sc.nextInt();
         int resultado  = suma1 + suma2;
         System.out.println("\n"+ suma1+" + "+suma2+" = " + resultado );
      }*/
    
}
