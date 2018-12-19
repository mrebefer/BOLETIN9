
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class Traballador {

    Scanner teclado = new Scanner(System.in);

    private double pedirSueldo() {

        double numero;
        do {
            System.out.println("Introduce sueldo :");
            numero = teclado.nextDouble();
        } while (numero < 0);
        return numero;

    }

    public void calcularTrabajadores() {
        double sueldo;
        int trabajadores = 0;
        int trabSueldoMas = 0;
        int trabSueldoMen = 0;
        float porcentaje = 0;
        do {
            sueldo = pedirSueldo();
            trabajadores++;

            if (sueldo >= 1000 && sueldo <= 1750) {
                trabSueldoMas++;
                System.out.println("El numero de trabajadores con sueldo entre 1000€ y 1750€ es: " + trabSueldoMas);
            } else if (sueldo < 1000) {
                trabSueldoMen++;
                porcentaje = trabSueldoMen * 100 / trabajadores;

                System.out.println("El porcentaje de trabajadores con sueldo inferior a 1000€ es: " + porcentaje + "%");
            }
        } while (sueldo != 0);

    }
}
