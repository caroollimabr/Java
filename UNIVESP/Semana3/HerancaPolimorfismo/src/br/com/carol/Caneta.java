package br.com.carol;

public class Caneta {

    private String marca, cor, tamanho;

    public Caneta(){
    }

    public Caneta(String marca, String cor, String tamanho){
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }



    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }



    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }



    public String toString(){
        return "Marca: "+getMarca()+"\nCor: "+getCor()+"\nTamanho: "+getTamanho();
    }

}

class CanetaTeste {
    public static void main(String[] args) {

        Caneta bic = new Caneta();
        bic.setMarca("Bic");
        bic.setCor("vermelha");
        bic.setTamanho("12cm");

        System.out.println("Tamanho: "+bic.getTamanho());
        System.out.println("Cor: "+bic.getCor());
        System.out.println("Marca: "+bic.getMarca());

    }
}
