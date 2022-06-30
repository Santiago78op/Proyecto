package com.Sbarrera.ejercicio2;

import java.util.Scanner;

public class centencia_do_while {

    public static void Do_While(){
        //paso = 1
        Scanner input = new Scanner(System.in);
        int dw, total_1, total_2;
        do{
            System.out.println("Ingrese un numero entre 0 y 5");
            dw = input.nextInt();
            if(dw >= 0 && dw <=5) {
                total_1 = dw * 100;
                total_2 = dw * 1000;
                System.out.println(total_1);
                System.out.println(total_2);
            }else{
                System.out.println("Adios");
            }
        }
        while( dw >= 0 && dw <=5);

    }
}
