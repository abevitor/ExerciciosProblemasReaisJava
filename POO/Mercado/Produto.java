package POO.Mercado;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


       public int adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        } else {
            System.out.println("Quantidade inválida! Digite um valor positivo.");
        }
        return this.quantidade;
    }

    public double vender(int qtd, double pagar){

        qtd = quantidade;
        pagar = qtd * preco;
        

        return pagar;

    }

    public void imprimirProduto(){

        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(getQuantidade());
    }
    
}
