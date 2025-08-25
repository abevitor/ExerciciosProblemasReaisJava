package POO.Carro;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setMarca("VOLKSVAGEN");
        carro.setAno(2011);
        carro.setModelo("GOL");
        carro.setVelocidadeATual(130);

        System.out.println(carro);
    }

    
    
}
