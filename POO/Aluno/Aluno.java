package POO.Aluno;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Double> notas;

    public Aluno() {
    notas = new ArrayList<>();
}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public ArrayList<Double> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }


    public void adcionarNota(double nota){
        notas.add(nota);
        System.out.println("Nota adcionada: " + nota);

    }

    public double calcularMedia(){

        double soma = 0;
        for (double nota : getNotas()) {
            soma += nota;
        }

         return notas.size() > 0 ? soma / notas.size() : 0;
        
    }

    public void ImprimirDados(){
        System.out.println("==== BOLETIM ====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("notas: " + this.notas);
        System.out.println("Média: " + calcularMedia());
        System.out.println("==========================");
    }
    
}
