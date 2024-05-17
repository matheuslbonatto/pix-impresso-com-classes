import java.util.ArrayList;
import java.util.Scanner;

import classes.CaixaEletronico;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import classes.ContaSalario;

public class App {
    public static void main(String[] args) throws Exception {
       ArrayList<Conta> contas = new ArrayList<Conta>();
       contas.add(new ContaCorrente(1, 123, 1234, 0, 
                            "Matheus Bonatto", "045.632.089-06", 
                            "12345678912345", "123"));

        contas.add(new ContaSalario(2, 123, 1234, 0, 
                                    "Matheus Bonatto", "045.632.089-06", 
                                    "12345678912345", "123"));
    
        contas.add(new ContaPoupanca(2, 123, 1234, 0, 
                                    "Matheus Bonatto", "045.632.089-06", 
                                    "12345678912345", "123"));
        
        // TODO - Criar uma lista de caixas eletronicos
        // TODO - Criar objetos do tipo caixa eletronico
        ArrayList<CaixaEletronico> caixaEletronico = new ArrayList<CaixaEletronico>();
        caixaEletronico.add(new CaixaEletronico(1, "Centro", 10.000));
        caixaEletronico.add(new CaixaEletronico(2, "Baixada", 5.000));
        caixaEletronico.add(new CaixaEletronico(3, "Pinheiros", 3.000));
        caixaEletronico.add(new CaixaEletronico(4, "Bancarios", 7.000));
        
        
        Scanner scanner = new Scanner(System.in);

       // - > ENTRADA
       // 1 - Ir até um caixa eletronico
       // 2 - Inserir 0 Cartão 
       // 2.1 - Ler os dados do cartão
       System.out.println("Insira o numero do cartão: ");
       String numeroCartao = scanner.nextLine();
      
       
       //Buscando a conta pelo numero do cartão
        Conta contaSaque = null;
        
        // Paa cada item da lista atrinua o valor da variavel conta
        for (Conta conta: contas){
            // Se o numero do cartão for igual a o numero de cartão de uma conta
            if (conta.getNumeroCartao().equals(numeroCartao)) {
                contaSaque = conta;
                break;                
            }
        }
        // Se o cartão não for encontrado vai apresentar um erro e terminar o programa
        if (contaSaque == null) {
            scanner.close(); 
            throw new Error("Conta não encontrada!");
        }

       // 3 - Inserir a senha
       System.out.println("Insira sua senha");
       String senha = scanner.nextLine();
       
       // 4 - Validar a Senha - > PROCESSAMENTO INTERMEDIARIO 
       // Se a senha estiver incorreta vai apresentar um erro e terminar o programa
       if (!contaSaque.getSenha().equals(senha)) {
         scanner.close(); 
          throw new Error("Senha invalida!");
          
       }
       
       // 5 - Informar o valor do saque 
       // TODO - 5.1 - Informar o id do Caixa Eletronico
       
       
       System.out.println("Insira seu caixa");
       int IdCaixa = scanner.nextInt();
       
       // TODO - 5.2 - Buscar o caixa eletronico na lista
       CaixaEletronico caixaId = null;

       for (CaixaEletronico caixaEletronico2 : caixaEletronico) {
        if (caixaEletronico2.getIdCaixaEletronico() == IdCaixa); { 
            caixaId = caixaEletronico2;
            break;
        }
    }
        // Se o cartão não for encontrado vai apresentar um erro e terminar o programa
        if (caixaId == null) {
            scanner.close(); 
            throw new Error("Caixa não encontrado!");
        }
    
       
       
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
