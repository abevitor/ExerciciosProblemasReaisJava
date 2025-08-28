package Polimorfismo.Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Funcionarios> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Vitor", 14000));
        funcionarios.add(new Estagiario("Bill", 2000));
        funcionarios.add(new Programador("Pablo", 20000));

        for(Funcionarios Funcionarios : funcionarios){
            System.out.println(Funcionarios.getNome() + " salário: R$" + Funcionarios.calcularSalario());
            
        }

    }
    
}
