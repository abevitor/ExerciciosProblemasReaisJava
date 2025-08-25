package POO.Aluno;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        aluno.setNome(nome);

        System.out.println("Digite a matricula do aluno");
        String matricula = scanner.nextLine();
        aluno.setMatricula(matricula);

        System.out.println("1-Imprimir Boletim");
        int resposta = scanner.nextInt();


       aluno.adcionarNota(8.5);
       aluno.adcionarNota(7.0);

        if(resposta == 1){
            aluno.ImprimirDados();

        } 

    }
    
}
