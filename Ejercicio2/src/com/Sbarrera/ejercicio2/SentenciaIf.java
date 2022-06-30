package com.Sbarrera.ejercicio2;

import java.util.Scanner;

public class SentenciaIf {

    public static void cantidadCifras(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número en el rango de 0 a 9999: ");
        int numero = input.nextInt();
        String cifra = Integer.toString(numero);
        System.out.print("Cantidad de cifras: "+cifra.length());
    }

    public static void nota(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una Nota en el rango de 0 a 10: ");
        int nota = input.nextInt();

        if (nota < 5){
            System.out.print("Su nota es Baja");
        }
        else if (nota >= 5 && nota <= 8){
            System.out.print("Su nota es Media");
        }
        else if (nota > 9){
            System.out.print("Su nota es Alta");
        }
    }

    public static void parImpar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num_1 = input.nextInt();
        System.out.print("Ingrese un numero: ");
        int num_2 = input.nextInt();

        if (num_1 % 2 == 0){
            System.out.print("Numero Par "+ num_1);
            if (num_2 % 2 == 0){
                System.out.print("Numero Par "+ num_2);
            }
        }
        else if (num_1 % 2 != 0){
            System.out.println("Numero impar " + num_1);
             if (num_2 % 2 != 0){
                System.out.print("Numero impar " + num_2);
            }
        }
    }

    public static void ordenar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num_1 = input.nextInt();
        System.out.print("Ingrese un numero: ");
        int num_2 = input.nextInt();
        System.out.print("Ingrese un numero: ");
        int num_3 = input.nextInt();
        int[] miArray = new int[] {num_1, num_2, num_3};

        int n = miArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (miArray[j] > miArray[j+1]){
                    int temp = miArray[j];
                    miArray[j] = miArray[j+1];
                    miArray[j+1] = temp;
                }
        int m = miArray.length;
        for (int i=0; i<n; ++i)
            System.out.print(miArray[i] + " ");
        System.out.println();
    }
}
