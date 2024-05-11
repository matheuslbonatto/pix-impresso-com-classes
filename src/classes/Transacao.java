package classes;

public class Transacao {
    private int idTransacao;
    private int idConta;
    private int idCaixaEletronico;
    private String dataHora;
    private Double valor;
    
    //(C - Credito / D - Debito)
    private char tipoTransacao; 
}
