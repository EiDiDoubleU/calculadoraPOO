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
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        /*System.out.println("ingresa tu nombre: \n");
        String nombre = sc.nextLine();
        System.out.println("hola " + nombre);*/
        System.out.println("1.Suma\n");
        System.out.println("2.Resta\n");
        System.out.println("3.Multiplicacion\n");
        System.out.println("4.Division\n");
        System.out.println("5.Salir\n");
        
        System.out.println("ingresa la opcion de tu preferencia: \n");
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                    System.out.println("Ingrese su primer numero: \n");
                    float suma1 = sc.nextFloat();
                    System.out.println("Ingrese su segundo numero: \n");
                    float suma2 = sc.nextFloat();
                   
                break;
            case 2 :
                System.out.println("Ingrese su primer numero: \n");
                    float resta1 = sc.nextFloat();
                    System.out.println("Ingrese su segundo numero: \n");
                    float resta2 = sc.nextFloat();
                break;
                
            case 3:
                System.out.println("Ingrese su primer numero: \n");
                    float mul1 = sc.nextFloat();
                    System.out.println("Ingrese su segundo numero: \n");
                    float mul2 = sc.nextFloat();
                break;
            
            case 4:
                System.out.println("Ingrese su primer numero: \n");
                    float div1 = sc.nextFloat();
                    System.out.println("Ingrese su segundo numero: \n");
                    float div2 = sc.nextFloat();
                break;
            
            case 5:
                System.exit(0);
                break;
            default: 
                System.out.println("La opcion ingresada es invalida");
                break;   
        }
    }
    
}
