package br.com.carol;

public class Bola {

    // atributos
    String material, cor;
    int tamanho;
    boolean cheia;

    // construtor padrão
    public Bola (){
        this.material = "";
        this.cor = "sem cor";
        this.tamanho = 0;
        this.cheia = false;
    }

    // sobrecarga
    public Bola(String material, String cor, int tamanho, boolean cheia) {
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
        this.cheia = cheia;
    }

    //getters
    public String getMaterial() {
        return material;
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isCheia() {
        return cheia;
    }

    public String isCheiaStr() {
        return (cheia ? "CHEIA" : "VAZIA");
    }

    // setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean setTamanho(int tamanho) {
        if (tamanho >= 0) {
            this.tamanho = tamanho;
            return true;
        }
        return false;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }

    // novos objetos
    Bola quico = new Bola("Borracha", "branca", 1, true);
    Bola chaves = new Bola("Gude", "azul", 2, false);

    // métodos
    public void pintar(String cor){
        this.cor = cor;
    }

    public void encher(){
        cheia = true;
    }

    public void esvaziar() {
        cheia = false;
    }


}
