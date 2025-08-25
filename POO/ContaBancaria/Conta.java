package POO.ContaBancaria;
import java.util.Scanner;

public class Conta {

    Scanner scanner = new Scanner(System.in);

    private int numeroConta;
    private String titular;
    private double saldo = 1000;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
       this.saldo += valor;
       System.out.println("Depósito realizado: " + valor);
    }

    public boolean sacar(double valor){
           if(valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado: " + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente! " + this.saldo);
            return false;
        }
        
        
    }

      public void imprimirExtrato(){
        System.out.println("==== Extrato Bancário ====");
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("==========================");
    }
    
}
