/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intoarrays;

/**
 *
 * @author SarhiCanela 
 */
public class IntoArrays {

    public static void main(String[] args) {
        
         // Declaracion del arreglo// 
        
        int [] numeros;
        numeros=new int[5];
        
        
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;
        
        
        // imprime los valores del arreglo -> array//
        System.out.println("El elemento de indice 0: " + numeros[0]);
        System.out.println("El elemento de indice 1: " + numeros[1]);
        System.out.println("El elemento de indice 2: " + numeros[2]);
        System.out.println("El elemento de indice 3: " + numeros[3]);
        System.out.println("El elemento de indice 4: " + numeros[4]);
        
        
        
        //suma
        //int suma=numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        
        //System.out.println("La suma del array es:" + suma);
        
        int suma = 0;
        
        for(int i=0; i< numeros.length;i++){
        suma+=numeros[i];
        
        System.out.println("El elemento de indice "+ i + " por el ciclo for es: " + numeros[i]);
    }
    System.out.println("La suma con el ciclo for es: " + suma);   
    
    }
        
        
    }
