
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
public class Sucesiones {

    Scanner teclado = new Scanner(System.in);

    //metodo que  pida por pantalla un numero que tiene que ser 0 o positivo
    private int pedirNumero() {

        int numero;
        do {
            System.out.println("Cuantos numeros deseas mostrar:");
            numero = teclado.nextInt();
        } while (numero < 0);
        return numero;

    }

    //a) 2 + 4 + 6 + 8 + 10 …..
    public void calcularPares() {
        int numero = pedirNumero();
        int serie = 2;
        System.out.println("Los " + numero + " pares que desea ver son:\n");
        for (int i = 1; i <= numero; i++) {
            if (i == 1) {
                System.out.println(serie);
            }
            serie += 2;
            System.out.println("+" + serie);

        }
    }

    //    b) - 1 + 2 – 3 + 4 – 5 + 6 …..
    public void calcularMasMenos() {
        int numero = pedirNumero();

        System.out.println("Los " + numero + " que desea ver son:\n");
        int serie = 0;
        for (int i = 1; i <= numero; i++) {

            if (serie % 2 == 0) {
                System.out.println("+" + serie);
            } else {
                System.out.println("-" + serie);
            }
            serie++;
        }
    }

    public void calcularFibonacci() {
        int numero = pedirNumero();
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Los " + numero + " de la serie de Fibonacci que desea ver son:\n");

        for (int i = 1; i <= numero; i++) {
            c = a + b;
            b = a;
            a = c;
            System.out.println(a);
        }

    }
}
