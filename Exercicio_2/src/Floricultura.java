package Exercicio_2.src;
import java.util.Scanner;

public class Floricultura {
    Scanner input = new Scanner(System.in);

    protected String nomeFlor = "";

    public void getNomeFlor(){
        System.out.println("Digite o nome da flor:");
        String nomeFlor = input.next();

        this.setNome(nomeFlor);
    }

    public void setNome(String nomeFlor){
        this.nomeFlor = nomeFlor;
    }

    protected int qtdIdeal = 0;

    public void getQtdIdeal(){
        System.out.println("Digite a quantidade ideal:");
        int qtdIdeal = input.nextInt();

        this.setQtdIdeal(qtdIdeal);
    }

    public void setQtdIdeal(int qtdIdeal){
        this.qtdIdeal = qtdIdeal;
    }

    protected int qtdEstoque = 0;

    public void getQtdEstoque(){
        System.out.println("Digite a quantidade presente no estoque:");
        int qtdEstoque = input.nextInt();

        this.setQtdEstoque(qtdEstoque);
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }


    private Integer estoqueIdeal(){
        int x = 0;
        int qtdE, qtdI;
        qtdE = this.qtdEstoque;
        qtdI = this.qtdIdeal;

        if (qtdE < qtdI) {
            for (int i = qtdE; i < qtdI; i++){
                x++;
            }
            return x;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Nome   -   Qtd Ideal   -   Qtd Estoque   -   Qtd Comprar\n" + this.nomeFlor +" - "+ this.qtdIdeal +" - "+ this.qtdEstoque +" - "+ this.estoqueIdeal();
    }

}
