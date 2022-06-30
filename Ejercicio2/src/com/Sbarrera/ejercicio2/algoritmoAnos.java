package com.Sbarrera.ejercicio2;
import java.util.Scanner;

public class algoritmoAnos {

    public static void numAnos(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese cantidad de Años: ");
        int anos = input.nextInt();
        int ano_meses = 12;
        int cantidad_anos;
        if(anos != 0){
            cantidad_anos = anos * ano_meses;
            System.out.println("La cantidad de Meses es: "+cantidad_anos);
        }
        else{
            System.out.println("No se realizan operaciones con 0 años");
        }

    }

    public static void anoNacimiento(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = input.next();
        System.out.print("Ingrese su Edad: ");
        int edad = input.nextInt();
        int ano_actual = 2022;
        int fecha_nacimeinto;
        if(edad != 0){
            fecha_nacimeinto = ano_actual - edad -1;
            System.out.println("Su nombre es: "+nombre+"\n"
            +"Su edad: "+edad+"\n"+
            "El año en que nacio fue: "+fecha_nacimeinto);
        }
        else{
            System.out.println("No se realizan operaciones con 0 años");
        }

    }
}
