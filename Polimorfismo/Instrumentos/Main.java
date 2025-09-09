package Polimorfismo.Instrumentos;

public class Main {
    public static void main(String[] args) {
        
        Instrumentos violao = new Violao();
        Instrumentos guitarra = new Guitarra();

        violao.tocar();
        guitarra.tocar();
    }
    
}
