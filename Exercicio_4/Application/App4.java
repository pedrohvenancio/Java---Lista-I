package Exercicio_4.Application;
import java.util.Scanner;

import Exercicio_4.src.Vendas;

public class App4 {
    public static void main(String[] args) {

        Vendas matriz = new Vendas();
        
        matriz.getVendas(matriz);
        matriz.printMat(matriz);
        matriz.totalMes(matriz);
        matriz.totalSemana(matriz);
        matriz.totalAno();

    }
}
