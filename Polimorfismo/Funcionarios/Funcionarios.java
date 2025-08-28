package Polimorfismo.Funcionarios;

abstract class Funcionarios {

    protected String nome;
    protected double salarioBase;

    public Funcionarios(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNome(){
        return nome;
    }
    
}
