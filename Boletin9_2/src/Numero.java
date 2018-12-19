
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
public class Numero {

    public void sumaProductoNumeros() {
        int i;
        int suma = 0;
        int producto = 0;
        for (i = 0; i < 2; i++) {
            int num = pedirNumeros();
            suma += num;
            producto = num;
            producto = producto * num;
        }
        System.out.println("\n la suma es :" + suma
                + " y el producto es: " + producto);
    }

    private int pedirNumeros() {
        int numero;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un numero:");
            numero = teclado.nextInt();
        } while (numero < 10 || numero > 90);
        return numero;
    }
}
