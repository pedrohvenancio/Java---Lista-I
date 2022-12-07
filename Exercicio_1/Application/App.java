package Exercicio_1.Application;
import java.util.Scanner;

import Exercicio_1.src.Salario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, bem vinda(o).");

        Salario[] manicures = new Salario[5];

        for (int i = 0; i < 5; i++){
            String x;
            int n1,n2;
            float y1, y2;
            System.out.println("Digite seu nome:");
            x = input.next();
            manicures[i].setNome(x);
            System.out.println("Digite a quantidade de mãos feitas:");
            n1 = input.nextInt();
            manicures[i].setQtdM(n1);
            System.out.println("Valor individual:");
            y1 = input.nextFloat();
            manicures[i].setVM(y1);
            System.out.println("Digite a quantidade de pés feitos:");
            n2 = input.nextInt();
            manicures[i].setQtdP(n2);
            System.out.println("Valor individual:");
            y2 = input.nextFloat();
            manicures[i].setVP(y2);
        }

        manicures.toString();
    }
}
