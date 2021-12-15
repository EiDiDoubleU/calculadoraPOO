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
public class functions {
    
    public static void SumarNumeros(){
        float suma1 , suma2, resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nIngrese su primer numero: \n");
            try{
                suma1 = sc.nextInt();
                System.out.println("\nIngrese su segundo numero: \n");
                suma2 = sc.nextInt();
                resultado  = suma1 + suma2;
                System.out.println("\nLa suma de "+suma1+" + "+suma2+ " = "+resultado);
                
            } catch(Exception e){
                sc.next();
                System.out.println("\n\n\n\n\n\n\n\nUsted no ingreso un valor numerico");
                System.out.println("\n-----PORFAVOR REINICIE EL SISTEMA-----");
            }
    }
      
    public static void RestarNumeros(){
        Scanner sc = new Scanner(System.in);
        float resta1,resta2,resultado;
        System.out.println("\nIngrese su primer numero: \n");
            try{
                resta1 = sc.nextInt();
                System.out.println("\nIngrese su segundo numero: \n");
                resta2 = sc.nextInt();
                resultado  = resta1 - resta2;
                System.out.println("\n"+ resta1+" - "+resta2+" = " + resultado );
            } catch(Exception e){
              sc.next();
                System.out.println("\n\n\n\n\n\n\n\nUsted no ingreso un valor numerico");
                System.out.println("\n-----PORFAVOR REINICIE EL SISTEMA-----");            
            }
    }
    
      
    public static void ProductoNumeros(){
        Scanner sc = new Scanner(System.in);
        float valor1, valor2,resultado;
        System.out.println("\nIngrese su primer numero: \n");
        try{
           valor1 = sc.nextInt();
           System.out.println("\nIngrese su segundo numero: \n");
           valor2 = sc.nextInt();
           resultado  = valor1 * valor2;
           System.out.println("\n"+ valor1+" * "+valor2+" = " + resultado );
        }catch(Exception e){
            System.out.println("\n\n\n\n\n\n\n\nUsted no ingreso un valor numerico");
            System.out.println("\n-----PORFAVOR REINICIE EL SISTEMA-----");            
        }    
    }
      
    public static void DivisionNumeros(){
        Scanner sc = new Scanner(System.in);
        float valor1, valor2, resultado; 
        System.out.println("\nIngrese su primer numero: \n");
        try{   
            valor1 = sc.nextInt();
            System.out.println("\nIngrese su segundo numero: \n");
            valor2 = sc.nextInt();
            if (valor2 == 0 ){
                System.out.println("\nSyntax Error\n");
            }else{
                resultado  = valor1 / valor2;
                System.out.println("\n"+ valor1+" / "+valor2+" = " + resultado );
            }
        }catch(Exception e){
            System.out.println("\n\n\n\n\n\n\n\nUsted no ingreso un valor numerico");
            System.out.println("\n-----PORFAVOR REINICIE EL SISTEMA-----");            
        
        }    
    }
    
    
}
