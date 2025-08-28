package Polimorfismo.Funcionarios;

 class Estagiario extends Funcionarios {

    public Estagiario(String nome, double salarioBase){

        super(nome, salarioBase);
}
        @Override
        public double calcularSalario(){
            return salarioBase;
        }
    
    } 

