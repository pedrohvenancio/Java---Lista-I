package Exercicio_7.Application;
import java.util.Scanner;
import Exercicio_7.src.Invoice;
//Finalizar a captura e impressão
public class App7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;

        System.out.println("Olá, bem vindo(a). Você deseja cadastrar quantos Items?");
        x = in.nextInt();
        
        Invoice[] items = new Invoice[x];

        for(int i = 0; i < x; i++){
            items[i] = new Invoice();
            System.out.println("Item " + (i+1) + ":");
            System.out.println("Item - Descrição do Item:");
            items[i].setDescItem(in.next());
            System.out.println("Preço Unitário:");
            items[i].setValUni(in.nextDouble());
            System.out.println("Quantidade comprada:");
            items[i].setQtdComp(in.nextInt());
        }

        for (int i = 0; i < x; i++){
            System.out.println(items[i].getInvoiceAmount());
        }
    }
}
