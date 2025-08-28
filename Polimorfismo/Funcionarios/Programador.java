package Polimorfismo.Funcionarios;

class Programador extends Funcionarios {
    
    public Programador(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return salarioBase * 1.1;
    }
}