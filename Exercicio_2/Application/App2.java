package Exercicio_2.Application;
import java.util.Scanner;
import Exercicio_2.src.Floricultura;

public class App2 {
    private static String string;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Floricultura[] flores = new Floricultura[50];
        int x;
        System.out.println("Olá, bem vindo(a). Você deseja cadastrar quantas flores?");
        System.out.println(" (LIMITE = 50)");
        x = input.nextInt();

        for (int i = 0; i < x; i++){
            flores[i] = new Floricultura();
            flores[i].getNomeFlor();
            flores[i].getQtdIdeal();
            flores[i].getQtdEstoque();
        }

        for (int i = 0; i < x; i++){
            System.out.println(flores[i].toString());
        }

        input.close();
    }
}
