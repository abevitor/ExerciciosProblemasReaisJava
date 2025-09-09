package Polimorfismo.FormasGeometricas;

public class Circulo extends Formas {

    private double raio;


       public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcular(){
        return Math.PI * raio * raio;

    }
    
}
