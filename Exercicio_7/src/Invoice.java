package Exercicio_7.src;

public class Invoice {
    private double numeroFaturado;
    private String descItem;
    private int qtdComprada;
    private double valorUni;

    public void setNumFatu(double n){
        this.numeroFaturado = n;
    }
    public double getNumFatu(){
        return this.numeroFaturado;
    }


    public void setDescItem(String n){
        this.descItem = n;
    }
    public String getDescItem(){
        return this.descItem;
    }


    public void setQtdComp(int n){
        this.qtdComprada = n;
    }
    public int getQtdComp(){
        return this.qtdComprada;
    }


    public void setValUni(double n){
        this.valorUni = n;
    }
    public double getValUni(){
        return this.valorUni;
    }

    public Invoice(){
        if (this.qtdComprada < 0){
            this.qtdComprada = 0;
        }
        if (this.valorUni < 0){
            this.valorUni = 0.0;
        }
    }

    public double getInvoiceAmount(){
        this.numeroFaturado = this.qtdComprada * this.valorUni;
        return this.numeroFaturado;
    }

}
