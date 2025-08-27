package POO.Mercado;

public class Main {
    public static void main(String[] args) {
        
        Produto produto = new Produto();

        produto.setNome("Maça");
        produto.setPreco(5);
        produto.setQuantidade(12);


        System.out.println(produto.adicionarEstoque(12));
        System.out.println("==================");
        System.out.println(produto.vender(12, 5));
        System.out.println("=================");
        produto.imprimirProduto();


    }
    
}
