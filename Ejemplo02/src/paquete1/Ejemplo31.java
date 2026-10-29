/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        double notaAsignatura1;
        double notaAsignatura2;
        String nombreEstudiante;
        String ciudadNacimiento;
        int anioNacimiento;
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = entrada.nextLine();
        System.out.println("Ingrese nombre de asignatura 2");
        nombreAsignatura2 = entrada.nextLine();
        
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = entrada.nextDouble();
        System.out.println("Ingrese nota de asignatura 2");
        notaAsignatura2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese nombre de estudiante");
        nombreEstudiante = entrada.nextLine();
        System.out.println("Ingrese su ciudad de nacimiento");
        ciudadNacimiento = entrada.nextLine();
        System.out.println("Ingresar año de nacimiento");
        anioNacimiento = entrada.nextInt();
        
        int edad = (2026 - anioNacimiento);
        
        // Se necesita ingresar le año de nacimiento   (entrada.nextInt()) 
        // y se necesita ingresar la ciudad de nacimiento
        
        System.out.printf("Asignatura 1: %s\nNota 1:%.2f\nAsignatura 2: %s\n "
                + "Nota 2: %.2f\nNombre de estudiante: %s\n"
                + "Ciudad de Nacimiento: %s\nEdad actual: %s\n",
                nombreAsignatura1,
                notaAsignatura1,
                nombreAsignatura2,
                notaAsignatura2,
                nombreEstudiante,
                ciudadNacimiento,
                edad);
   
    }
    
}


