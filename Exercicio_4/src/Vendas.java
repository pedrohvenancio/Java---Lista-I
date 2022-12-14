package Exercicio_4.src;
import java.util.Scanner;

public class Vendas {
    Scanner in = new Scanner(System.in);

    public Float[][] venda = new Float[12][4];

    public Float totalA = 0.0f;


    public void getVendas(Vendas matriz){
        for(int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Insira a quantidade de vendas na semana " + (j+1) + " do mes " + (i+1) + ":");
                matriz.venda[i][j] = in.nextFloat();
                this.totalA = totalA + matriz.venda[i][j];
            }
            
        }
    }

    public void printMat(Vendas matriz){
        System.out.println("Vendas:");

        for(int i = 0; i < 12; i++){
            System.out.println("Mês " + (i+1) + ":");
            for (int j = 0; j < 4; j++){
                System.out.println("Semana " + (j+1) + ":   " + matriz.venda[i][j]);
            }
        }
    }

    public void totalMes(Vendas matriz){
        float[] totalM = new float[12];
        
        for (int i = 0; i < 12; i++){
            totalM[i] = 0.0f;
        }

        for(int i = 0; i < 12; i++){
            for (int j = 0; j < 4; j++){
                totalM[i] = totalM[i] + matriz.venda[i][j];
            }
        }

        for(int i = 0; i < 12; i++){
            System.out.println("Total vendido no mês " + (i+1) + ":   " + totalM[i]);
        }
    }    

    public void totalSemana(Vendas matriz){
        float[] totalS = new float[4];

        for (int i = 0; i < 4; i++){
            totalS[i] = 0.0f;
        }

        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 12; j++){
                totalS[i] = totalS[i] + matriz.venda[j][i];
            }
        }

        for(int i = 0; i < 4; i++){
            System.out.println("Total vendido na semana " + (i+1) + ":   " + totalS[i]);
        }
    }


    public void totalAno(){
        System.out.println("Total vendido no ano todo:   " + this.totalA);
    }
}
