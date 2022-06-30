package com.Sbarrera.ejercicio1;
import java.security.KeyStore;
import com.Sbarrera.ejercicio1.OperacionesLogicas;

public class Main {

    public static void main(String[] args) {
        //Ejercico 1 y 2
        // Las instrucciones y declaraciones finalizan con ;
        //Declaración de Variables
        byte beat;
        int precio;
        int importe_acumulado;
        String profesor;
        String aula;
        int capacidad;
        boolean funciona;
        boolean esVisible;
        float diametro;
        double peso;
        short edad;
        long masa;
        char letra1;
        //Tipos de Variables en JAVA:
        beat = 127; //-128 a 127
        precio = 42; // Entero tipo int. Un número sin punto decimal se interpreta normalmente como int.
        importe_acumulado = 210; // Entero tipo int
        profesor = "Ernesto Juárez Pérez"; // Tipo String
        aula = "A-44"; // Tipo String
        capacidad = 1500; // Entero tipo int
        funciona = true; // Tipo boolean
        esVisible = false; // Tipo boolean
        diametro = 34.25f; // Tipo float. Una f o F final indica que es float.
        peso = 88.77; // Tipo double. Un número con punto decimal se interpreta normalmente como double.
        edad = 19; // Entero tipo short
        masa = 178823411L; // Entero tipo long. Una l o L final indica que es long.
        letra1 = 'h'; // Tipo char (carácter). Se escribe entre comillas simples.
        //% lo que sobra de una division

        OperacionesLogicas obj = new OperacionesLogicas();
        int sumar = obj.suma(7,9);
        double restar = obj.resta(16.5,9.69);
        int multiplicar = obj.multiplicacion(5,5);
        float dividir = obj.division(8,4);
        double residuo = obj.residuo(8,6);

        System.out.println(sumar);
        System.out.println(restar);
        System.out.println(multiplicar);
        System.out.println(dividir);
        System.out.println(residuo);

        //extraer posicion de cadena substring()
        //equals compara el parametro

    }

}
