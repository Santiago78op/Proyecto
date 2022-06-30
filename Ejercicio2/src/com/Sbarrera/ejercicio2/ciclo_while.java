package com.Sbarrera.ejercicio2;
import java.util.Scanner;

public class ciclo_while {

    public static void CicloWhile_1(){
        //paso = 1
        Scanner input = new Scanner(System.in);
        int num, cuadrado;
        boolean continuar = true;
        System.out.println("Ingrese un numero: ");
        num = input.nextInt();
        while(continuar){
            if (num >= 0){
                cuadrado = num * num;
                System.out.println(cuadrado);
                System.out.println("Ingrese un numero: ");
                num = input.nextInt();
                continuar = true;
            }else{
                System.out.println("No acepto numeros nagativos");
                continuar = false;
            }

        }
    }

    public static void CicloWhile_2(){
        //paso = 1
        Scanner input = new Scanner(System.in);
        int num, cuadrado;
        boolean continuar = true;
        System.out.println("Ingrese un numero: ");
        num = input.nextInt();
        while(continuar){
            if( num !=0){
                if (num > 0){
                    System.out.println(num+" "+"Es numero positivo");
                    num = input.nextInt();
                    continuar = true;
                }else{
                    System.out.println(num+" "+"Es numero nagativo");
                    num = input.nextInt();
                    continuar = true;
                }
            }else{
                System.out.println(num+" "+"Es cero no lo leo");
                continuar = false;
            }

        }
    }

    public static void CicloWhile_3(){
        //paso = 1
        Scanner input = new Scanner(System.in);
        int num;
        boolean continuar = true;
        System.out.println("Ingrese un numero: ");
        num = input.nextInt();
        while(continuar){
            if( num !=0){
                if (num % 2 == 0){
                    System.out.println(num+" "+"Es Par");
                    num = input.nextInt();
                    continuar = true;
                }else{
                    System.out.println(num+" "+"Es Impar");
                    num = input.nextInt();
                    continuar = true;
                }
            }else{
                System.out.println(num+" "+"No lo leo");
                continuar = false;
            }

        }
    }

    public static void CicloWhile_4(){
        //paso = 1
        Scanner input = new Scanner(System.in);
        int num;
        int cont = 0;
        boolean continuar = true;
        System.out.println("Ingrese un numero: ");
        num = input.nextInt();
        while(continuar){
            if (num >= 0){
                System.out.println("Ingrese un numero: ");
                num = input.nextInt();
                cont++;
                continuar = true;
            }else{
                System.out.println("No acepto numeros nagativos");
                System.out.println("Ingreso: "+cont);
                continuar = false;
            }

        }
    }
}
