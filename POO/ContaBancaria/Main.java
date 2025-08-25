package POO.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();
        conta.setNumeroConta(numeroConta);

        scanner.nextLine();

        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();
        conta.setTitular(titular);

        System.out.println("1- Depositar");
        System.out.println("2- Sacar");
        System.out.println("3- Extrato");
        int escolha = scanner.nextInt();

        if(escolha == 1){

        System.out.println("Quanto deseja depositar?");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);
        conta.imprimirExtrato();

        return;

        }

        if(escolha == 2){
        System.out.println("Quanto deseja sacar?");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        }

        if(escolha == 3){
            conta.imprimirExtrato();
            return;
        }

        

        

             

  
        
        
       


        


    }
    
}
