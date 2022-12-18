package Exercicio_10.Application;
import java.util.Scanner;
import Exercicio_10.src.Primos;

public class App10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = in.nextInt();

        Primos primos = new Primos();
        primos.setNum(num);

        System.out.println();
        System.out.print("Fatores primos de " + num + ": ");

        int tam = primos.contaFatores();
        int[] vect = new int[tam];

        vect = primos.arrayFatoresPrimos();

        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        in.close();
    }
}
