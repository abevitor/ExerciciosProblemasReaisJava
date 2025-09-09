package Polimorfismo.Veiculos;

abstract class Veiculos {
 private double velocidade;
    private String modelo;
    private String marca;
    private int ano;

    public abstract void emitirSom();
    public abstract void ligar();
    public abstract void acelerar();



    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
