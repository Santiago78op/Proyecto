package com.Sbarrera.ejercicio2;

import java.util.Scanner;
import java.io.IOException;

public class Actividad_ADH2 {

    public static void Menu(){
        boolean salir = false;
        boolean if_1 = false;

        while(!salir){
            int number;
            Scanner input = new Scanner(System.in);
            System.out.print("Bienvenido a la Estructura de Control \n");
            System.out.print("1) Estructura If \n" +
                    "2) Estructura Else If \n" +
                    "3) Estructura Switch Case \n" +
                    "4) Estructura Ciclo for \n" +
                    "5) Estructura Ciclo While \n" +
                    "6) Estructura Do While \n" +
                    "0) Salir \n");
            System.out.print("Escoja una Opción: ");
            number = input.nextInt();

            switch(number){//1
                case 1:
                    System.out.println("Estructura If");
                    while(!if_1){
                        int num;
                        System.out.print("Bienvenido a la Estructura de Control If \n");
                        System.out.print("1) Nota Alta o Baja \n" +
                                "2) Ingrese su edad \n" +
                                "3) Ingrese su estatura\n" +
                                "0) Salir \n");
                        System.out.print("Escoja una Opción: ");
                        num = input.nextInt();
                        switch(num){
                            case 1:
                                int cifra;
                                System.out.println("Ingrese un numero entre 0 y 100: ");
                                cifra = input.nextInt();
                                if (cifra > 50){
                                    System.out.println("Nota Alta");
                                    continue;
                                }else{
                                    System.out.println("Nota Baja");
                                    continue;
                                }
                            case 2:
                                int edad;
                                System.out.println("Ingrese su edad: ");
                                edad = input.nextInt();
                                if (edad >= 18){
                                    System.out.println("Es mayor de edad");
                                    continue;
                                }else{
                                    System.out.println("Es menor de edad");
                                    continue;
                                }
                            case 3:
                                float estatura;
                                System.out.println("Ingrese su estatura: ");
                                estatura = input.nextFloat();
                                if (estatura >= 1.65){
                                    System.out.println("Usted es Alto");
                                    continue;
                                }else{
                                    System.out.println("Usted es Bajo");
                                    continue;
                                }
                            case 0:
                                System.out.println("Salio de este Menú");
                                break;
                        }
                        if (num == 0){
                            if_1 = true;
                        }
                    }
                case 2:
                    System.out.println("Estructura Else If");
                    while(!if_1){
                        int num;
                        System.out.print("Bienvenido a la Estructura de Control Else If \n");
                        System.out.print("1) Nota Alta, Baja o Media \n" +
                                "2) Número Par o Impar\n" +
                                "3) Ingrese una Letra\n" +
                                "0) Salir \n");
                        System.out.print("Escoja una Opción: ");
                        num = input.nextInt();
                        switch(num) {
                            case 1:
                                int nota;
                                System.out.println("Ingrese una nota entre 0 y 100: ");
                                nota = input.nextInt();
                                if (nota >= 60) {
                                    System.out.println("Nota Alta");
                                    continue;
                                } else if (nota > 60 && nota < 75) {
                                    System.out.println("Nota Media");
                                    continue;
                                } else {
                                    System.out.println("Nota Baja");
                                    continue;
                                }
                            case 2:
                                int num_1;
                                System.out.println("Ingrese número: ");
                                num_1 = input.nextInt();
                                if (num_1 % 2 == 0) {
                                    System.out.println("Par");
                                    continue;
                                } else {
                                    System.out.println("Impar");
                                    continue;
                                }
                            case 3:
                                char letra;
                                System.out.println("Ingrese una letra: ");
                                letra = input.next().charAt(0);
                                if (Character.isUpperCase(letra))
                                {
                                    System.out.println("Es una letra mayúscula");
                                } else {
                                    System.out.println("No es una letra mayúscula");
                                }
                            case 0:
                                System.out.println("Salio de este Menú");
                                break;
                        }
                        if (num == 0){
                            if_1 = true;
                        }
                    }
                case 3:
                    System.out.println("Estructura Switch Case");
                    while(!if_1){
                        int num;
                        System.out.print("Bienvenido a la Estructura de Control Switch Case\n");
                        System.out.print("1) Meses del Año\n" +
                                "0) Salir \n");
                        System.out.print("Escoja una Opción: ");
                        num = input.nextInt();
                        switch(num) {
                            case 1:
                                int mes;
                                System.out.print("Meses del año");
                                System.out.print("Ingrese un numero para saber el mes del año: ");
                                mes = input.nextInt();

                                // Declaracion del switch
                                switch(mes){//1
                                    case 1:
                                        System.out.println("Enero");
                                        continue;
                                    case 2:
                                        System.out.println("Febrero");
                                        continue;
                                    case 3:
                                        System.out.println("Marzo");
                                        continue;
                                    case 4:
                                        System.out.println("Abril");
                                        continue;
                                    case 5:
                                        System.out.println("Mayo");
                                        continue;
                                    case 6:
                                        System.out.println("Junio");
                                        continue;
                                    case 7:
                                        System.out.println("Julio");
                                        continue;
                                    case 8:
                                        System.out.println("Agosto");
                                        continue;
                                    case 9:
                                        System.out.println("Septiembre");
                                        continue;
                                    case 10:
                                        System.out.println("Octubre");
                                        continue;
                                    case 11:
                                        System.out.println("Noviembre");
                                        continue;
                                    case 12:
                                        System.out.println("Diciembre");
                                        continue;
                                }
                            case 0:
                                System.out.println("Salio de este Menú");
                                break;
                        }
                        if (num == 0){
                            if_1 = true;
                        }
                    }

                case 4:
                    System.out.println("Estructura Ciclo for");
                    while(!if_1){
                        int num;
                        System.out.print("Bienvenido a la Estructura de Control Ciclo for \n");
                        System.out.print("1) Cilo de 3 asta 10 \n" +
                                "2) Cuenta regresiva\n" +
                                "3) Cuenta de dos en dos\n" +
                                "0) Salir \n");
                        System.out.print("Escoja una Opción: ");
                        num = input.nextInt();
                        switch(num) {
                            case 1:
                                for (int x = 3; x <= 10; x++) {
                                    System.out.println("Valor: " + x);
                                }
                                continue;
                            case 2:
                                for (int i = 10; i > 0; i--) {
                                    System.out.println("Valor: " + i);
                                } continue;
                            case 3:
                                for(int i=0;i<=10;i=i+2) {
                                    System.out.println(i);
                                } continue;
                            case 0:
                                System.out.println("Salio de este Menú");
                                break;
                        }
                        if (num == 0){
                            if_1 = true;
                        }
                    }
                case 5:
                    System.out.println("Estructura Ciclo While");
                    while(!if_1){
                        int num;
                        System.out.print("Bienvenido a la Estructura de Control Ciclo While \n");
                        System.out.print("1) While menor a diez \n" +
                                "2) Saludo\n" +
                                "0) Salir \n");
                        System.out.print("Escoja una Opción: ");
                        num = input.nextInt();
                        switch(num) {
                            case 1:
                                int cantidad = 0;
                                System.out.print("Ingrese una cantidad: ");
                                cantidad = input.nextInt();
                                if (cantidad <= 10){
                                    while (cantidad < 10) {
                                        System.out.println("cantidad: " + cantidad);
                                        cantidad++;
                                    }
                                    continue;
                                }else{
                                    System.out.println("No puedo resolver esto");
                                    continue;
                                }
                            case 2:
                                String saludo;
                                System.out.print("Ingrese hola o adios: ");
                                saludo = input.next();
                                boolean saludar = true;
                                if (saludo.equals("hola")){
                                    while (saludar) {
                                        System.out.println("Me llamo Walli...");
                                        saludar = false;
                                    }continue;
                                }else if(saludo.equals("adios")){
                                    while (saludar) {
                                        System.out.println("Espero verte pronto...");
                                        saludar = false;
                                    }continue;
                                }
                                else{
                                    System.out.println("No puedo resolver esto");
                                    continue;
                                }

                            case 0:
                                System.out.println("Salio de este Menú");
                                break;
                        }
                        if (num == 0){
                            if_1 = true;
                        }
                    }
                case 6:
                    System.out.println("Estructura Do While");
                    while(!if_1){
                        int num;
                        System.out.print("Bienvenido a la Estructura de Control Do While \n");
                        System.out.print("1) Contar de 1 a 10 \n" +
                                "0) Salir \n");
                        System.out.print("Escoja una Opción: ");
                        num = input.nextInt();
                        switch(num) {
                            case 1:
                                int contador = 0 ;
                                do {   System.out.println ("Contando... " + (contador+1) );
                                    contador += 1;
                                } while (contador<10);
                                continue;
                            case 0:
                                System.out.println("Salio de este Menú");
                                break;
                        }
                        if (num == 0){
                            if_1 = true;
                        }
                    }
                case 0:
                    System.out.println("Hasta Pronto");
                    break;
            }
            if (number == 0){
                salir = true;
            }
            else if ( number < 0 || number > 6){
                System.out.println("No cuento con esta opción");

            }
        }
    }
}
