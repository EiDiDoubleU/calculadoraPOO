/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

public class functions {
        
      public static void SumarNumeros(){
         Scanner sc = new Scanner(System.in);
         System.out.println("\nIngrese su primer numero: \n");
         int suma1 = sc.nextInt();
         System.out.println("\nIngrese su segundo numero: \n");
         int suma2 = sc.nextInt();
         int resultado  = suma1 + suma2;
         System.out.println("\n"+ suma1+" + "+suma2+" = " + resultado );
      }
      
      public static void RestarNumeros(){
         Scanner sc = new Scanner(System.in);
         System.out.println("\nIngrese su primer numero: \n");
         int resta1 = sc.nextInt();
         System.out.println("\nIngrese su segundo numero: \n");
         int resta2 = sc.nextInt();
         int resultado  = resta1 - resta2;
         System.out.println("\n"+ resta1+" - "+resta2+" = " + resultado );
      }
      
      public static void ProductoNumeros(){
         Scanner sc = new Scanner(System.in);
         System.out.println("\nIngrese su primer numero: \n");
         int valor1 = sc.nextInt();
         System.out.println("\nIngrese su segundo numero: \n");
         int valor2 = sc.nextInt();
         int resultado  = valor1 * valor2;
         System.out.println("\n"+ valor1+" * "+valor2+" = " + resultado );
      }
      
      public static void DivisionNumeros(){
         Scanner sc = new Scanner(System.in);
         System.out.println("\nIngrese su primer numero: \n");
         int valor1 = sc.nextInt();
         System.out.println("\nIngrese su segundo numero: \n");
         int valor2 = sc.nextInt();
         int resultado  = valor1 / valor2;
         System.out.println("\n"+ valor1+" / "+valor2+" = " + resultado );
      }
}
