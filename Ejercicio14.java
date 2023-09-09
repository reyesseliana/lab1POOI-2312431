/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numDia =0; // Valor que ingresa el usuario mediante el teclado.
        
        System.out.println("Ingrese un número de(1-7): ");
        numDia = scanner.nextInt();
        
        switch(numDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7: 
                System.out.println("Domingo");
                break;
            default :
                System.out.println("El número ingresado es invalido");
                break;
        }
        
        scanner.close();
    }
}

