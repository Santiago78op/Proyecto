package com.Sbarrera.ejercicio2;

import java.util.Scanner;

public class Switch {

    public static void sentencEswitch(){
        int dia;
        Scanner input = new Scanner(System.in);
        System.out.print("Dias de la Semana");
        System.out.print("Ingrese un numero para saber el dia de la semana: ");
        dia = input.nextInt();

        // Declaracion del switch
        switch(dia){//1
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("El dia no existe");
                break;
        }
    }

    public static void Ejercicio_Ano(){
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.print("Meses del año");
        System.out.print("Ingrese un numero para saber el mes del año: ");
        mes = input.nextInt();

        // Declaracion del switch
        switch(mes){//1
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("El mes no existe");
                break;
        }
    }

    public static void Ejercicio_nota(){
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.print("Nota entre 0 a 10");
        System.out.print("Ingrese una nota para saber el nombre: ");
        mes = input.nextInt();

        // Declaracion del switch
        switch(mes){//1
            case 0:
                System.out.println("cero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
            default:
                System.out.println("El mes no existe");
                break;
        }
    }
}
