
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
public class Triangulo {

    private double base;
    private double altura;

    private void pedirBase() {
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce base:");
            this.base = teclado.nextDouble();
        } while (this.base < 0);
    }

    private void pedirAltura() {
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce la altura:");
            this.altura = teclado.nextDouble();
        } while (this.altura < 0);
    }

    public void calcularAreaTriangulo() {
        double area;
        pedirBase();
        pedirAltura();
        area = (this.base * this.altura) / 2;
        System.out.println("El area del triangulo de base " + this.base + "y altura " + this.altura + " es: " + area);
    }
}
