/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_semana2;

import java.util.Scanner;

/**
 *
 * @author HomeMV
 */
public class Ejercicios_Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero3d,digito;
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingrese un numero de 3 digitos: ");
        numero3d=lector.nextInt();
        int numero =numero3d;
        int suma = 0;
        while (numero != 0){
            digito = numero%10;
            suma+=digito;
            numero = numero / 10;
        }
        System.out.println("la suma de los digitos de " + numero3d + " es " +suma);
    }
    
}
