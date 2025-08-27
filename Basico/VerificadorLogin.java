package Basico;
import java.util.Scanner;

public class VerificadorLogin {
    public static void main(String[] args) {

        String emailCorreto = "vitor.abe@gmail.com";
        String senhaCorreta = "Vitriz3003!";

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================== BEM VINDO ======================");
        System.out.println("1- Login");
        System.out.println("2- Cadastro");
        System.out.println("=======================================================");

        System.out.println("Selecione usando números!");
        int resposta = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer do Enter

        if(resposta == 1){
            System.out.println("Digite seu email: ");
            String email = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();

            if(email.equals(emailCorreto) && senha.equals(senhaCorreta)){
                System.out.println("Seja bem-vindo ao seu email!");
                
            }

            System.out.println("Dados incorretos!");
            System.out.println("=======================");
            System.out.println("Deseja redefinir a senha? (sim/nao)");
            String redefinir = scanner.nextLine();

            if(redefinir.equalsIgnoreCase("sim")){
                System.out.println("Digite sua nova senha:");
                String novaSenha = scanner.nextLine();
                senhaCorreta = novaSenha;

                System.out.println("Digite seu email:");
                String cadastrarNovamente = scanner.nextLine();
                System.out.println("Digite sua senha: ");
                String senhaNovamente = scanner.nextLine();

                if (senhaNovamente.equals(senhaCorreta) && cadastrarNovamente.equals(emailCorreto)) {
                    System.out.println("SEJA BEM VINDO");
                    
                } else {
                    System.out.println("Email ou senha ainda incorretos!");
                }
            }
        }

        if (resposta == 2) {

            System.out.println("Digite o email que você deseja cadastrar: ");
            String novoEmailCadastro = scanner.nextLine();

            System.out.println("Digite uma senha:");
            String novaSenhaCadastro = scanner.nextLine();

            if (novoEmailCadastro.equals(emailCorreto)) {
                System.out.println("Já existe um cadastro nesse email!");
            }else {
                
            System.out.println("Seu endereço de email: " + novoEmailCadastro + " foi cadastrado");
            System.out.println("Sua senha: " + novaSenhaCadastro + " foi registrada");

            }

            
        }

        scanner.close();
    }
}
