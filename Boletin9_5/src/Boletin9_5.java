
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
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sucesiones sucesion = new Sucesiones();

        System.out.println("\nBienvenido al calculador de series:\n ");
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    sucesion.calcularPares();
                    break;
                case 2:
                    sucesion.calcularMasMenos();
                    break;
                case 3:
                    sucesion.calcularFibonacci();
                    break;
                case 0:
                    System.out.println("\n\t Gracias por usar la calculadora de series");
                    break;
                default:
                    System.out.println("La operación elegida no existe.");
                    break;
            }
        } while (opcion != 0);

    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nQue operación desea realizar:"
                + "\n1=>Mostrar sucesión de numeros pares"
                + "\n2=>Mostrar sucesion de numeros positivos par y negativo impar"
                + "\n3=>Mostrar sucesión de Fibonacci"
                + "\n0=>Salir");

        return Integer.parseInt(teclado.nextLine());
    }

}
