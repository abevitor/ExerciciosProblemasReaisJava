package POO.Carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeATual;


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getVelocidadeATual() {
        return velocidadeATual;
    }
    public void setVelocidadeATual(double velocidadeATual) {
        this.velocidadeATual = velocidadeATual;
    }
    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", velocidadeATual=" + velocidadeATual
                + "]";
    }

    
    
}
