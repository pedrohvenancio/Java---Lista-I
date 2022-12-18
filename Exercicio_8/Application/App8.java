package Exercicio_8.Application;
import java.util.Scanner;
import Exercicio_8.src.IntegerSet;

public class App8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Qual o tamanho do conjunto A: ");
        int tamA = in.nextInt();

        int[] conjA = new int[tamA];

        System.out.println();
        System.out.println("Digite os elementos do conjunto A");

        for (int i = 0; i < conjA.length; i++) {
            conjA[i] = in.nextInt();
        }

        System.out.println();
        System.out.print("Qual o tamanho do conjunto B: ");
        int tamB = in.nextInt();

        int[] conjB = new int[tamB];

        System.out.println();
        System.out.println("Digite os elementos do conjunto B");

        for (int i = 0; i < conjB.length; i++) {
            conjB[i] = in.nextInt();
        }

        IntegerSet setA = new IntegerSet();
        IntegerSet setB = new IntegerSet();

        for (int i = 0; i < conjA.length; i++) {
            setA.adicionarElemento(conjA[i]);
        }

        for (int i = 0; i < conjB.length; i++) {
            setB.adicionarElemento(conjB[i]);
        }

        System.out.println();
        System.out.println("conj A = " + setA.toString());

        System.out.println();
        System.out.println("conj B = " + setB.toString());

        boolean loop = true;
        IntegerSet result = new IntegerSet();

        result = result.uniao(setA, setB);

        System.out.println();
        System.out.println("AUB = " + result.toString());
           
        result = result.intersecao(setA, setB);

        System.out.println();
        System.out.println("A(intersec)B = " + result.toString());

        result = result.diferencaAB(setA, setB);

        System.out.println();
        System.out.println("A-B = " + result.toString());

        result = result.diferencaBA(setA, setB);

        System.out.println();
        System.out.println("B-A = " + result.toString());

        in.close();
    }
}
