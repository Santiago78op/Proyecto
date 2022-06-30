package com.Sbarrera.ejercicio2;
import java.util.Scanner;

public class scannerFuncion {

    public static void saludar() {
        //Crear nuestro objeto de la clase scanner
        //1- identificar la clase de la cual crearemos el objeto
        //2- realizar la intancia (crear el objeto referente a la clase)
        Scanner input = new Scanner(System.in);//Se importa la Clase
        System.out.print("Ingresa tu Nombre: ");
        String nombre = input.next();// variable = input.xxx();
        System.out.print("Ingresa tu Apellido: ");
        String apellido = input.next();
        System.out.print("Ingresa tu Edad: ");
        int edad = input.nextInt();
        System.out.print("Ingresa tu Genero: ");
        String genero = input.next();
        System.out.print("Ingresa tu Estudio: ");
        String estudio = input.next();
        System.out.print("Ingresa tu Auto Favorito: ");
        String auto = input.next();
        System.out.print("Ingresa tu Color Favorito: ");
        String color = input.next();
        System.out.print("Ingresa tu Comida Favorita: ");
        String comida = input.next();

        String oracion;

        oracion = "Mi nombre es: " +nombre+" "+apellido+" "+"tengo"+" "+edad+" "+"años"
                +" "+"estudio"+" "+estudio+" "+"y"+" "+"tengo un carro"+" "+auto+" "+"y"
                +" "+"mi color favorito es"+" "+color+" "+"lo que mas amo es comer"+" "+comida;
        //Se crea el mensaje de saludo
        System.out.println(oracion);
        //Se crea el mensaje de saludo en Mayuscula
        System.out.println(oracion.toUpperCase());
        //Se crea el mensaje de saludo en Mayuscula
        System.out.println(oracion.toLowerCase());
    }
}
