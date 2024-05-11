import java.util.ArrayList;
import java.util.Scanner;

import classes.Conta;

public class App {
    public static void main(String[] args) throws Exception {
       ArrayList<Conta> contas = new ArrayList<Conta>();
       contas.add(new Conta(1, 123, 1234, 0, 
                            "Matheus Bonatto", "045.632.089-06", 1, 
                            "12345678912345", "123"));
       
        Scanner scanner = new Scanner(System.in);

       // - > ENTRADA
       // 1 - Ir até um caixa eletronico
       // 2 - Inserir 0 Cartão 
       // 2.1 - Ler os dados do cartão
       System.out.println("Insira o numero do cartão: ");
       String numeroCartao = scanner.nextLine();
       
        Conta contaSaque = null;
        for (Conta conta: contas){
            // Se o numero do cartão for igual a o numero de cartão de uma conta
            if (conta.getNumeroCartao().equals(numeroCartao)) {
                contaSaque = conta;
                break;                
            }
        }
        // Se o cartão não for encontradovai apresentar um erro e terminar o programa
        if (contaSaque == null) {
            throw new Error("Conta não encontrada!");
        }

       // 3 - Inserir a senha
       System.out.println("Insira sua senha");
       String senha = scanner.nextLine();
       
       // 4 - Validar a Senha - > PROCESSAMENTO INTERMEDIARIO 
       // Se a senha estiver incorreta vai apresentar um erro e terminar o programa
       if (!contaSaque.getSenha().equals(senha)) {
          throw new Error("Senha invalida!");
       }
       
       // 5 - Informar o valor do saque 
       
       // - > PROCESSAMENTO     
       // 6 - Validar se o caixa possui saldo
       // 7 - Validar se a conta possui saldo
       // 8 - Liberar o dinheiro para o cliente 
       // 9 - Registrar a Transação
       
       // - > SAIDA
       // 10 - Encerrar a operação
       scanner.close(); 
    }
}
