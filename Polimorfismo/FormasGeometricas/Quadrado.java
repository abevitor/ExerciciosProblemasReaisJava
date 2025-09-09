package Polimorfismo.FormasGeometricas;

public class Quadrado extends Formas {
    private double lado;

    public Quadrado( double lado){
        this.lado = lado;
    }

    @Override
    public double calcular(){
        return lado * lado;

    }
    
}
