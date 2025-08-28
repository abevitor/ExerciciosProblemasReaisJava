package Polimorfismo.Funcionarios;

class Gerente extends Funcionarios {

	public Gerente(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public double calcularSalario() {
		return salarioBase * 1.2;
	}
}
