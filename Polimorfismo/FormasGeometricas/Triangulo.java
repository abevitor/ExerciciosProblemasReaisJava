package Polimorfismo.FormasGeometricas;

public class Triangulo extends Formas {
    private double altura;
    private double lado;

    public Triangulo(double altura, double lado){
        this.altura = altura;
        this.lado = lado;
    }



    @Override
    public double calcular(){

        return (lado * altura) / 2;

    }



    @Override
    public String toString() {
        return "Triangulo [altura=" + altura + ", lado=" + lado + ", calcular()=" + calcular() + "]";
    }
    
}
