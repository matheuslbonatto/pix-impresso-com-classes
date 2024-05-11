package classes;

public class Conta {
 private int idConta;
 private int numero;
 private int agencia;
 private int digitoVerificador;
 private String nome;
 private String cpf;

 //(1 - C.Corrente / 2 - C.Salario / 3 - C.Poupança)
 private int tituloConta; 
 private String numeroCartao; 
 private String senha;
public Conta(int idConta, int numero, int agencia, int digitoVerificador, String nome, String cpf, int tituloConta,
        String numeroCartao, String senha) {
    this.idConta = idConta;
    this.numero = numero;
    this.agencia = agencia;
    this.digitoVerificador = digitoVerificador;
    this.nome = nome;
    this.cpf = cpf;
    this.tituloConta = tituloConta;
    this.numeroCartao = numeroCartao;
    this.senha = senha;
}
public int getIdConta() {
    return idConta;
}
public int getNumero() {
    return numero;
}
public int getAgencia() {
    return agencia;
}
public int getDigitoVerificador() {
    return digitoVerificador;
}
public String getNome() {
    return nome;
}
public String getCpf() {
    return cpf;
}
public int getTituloConta() {
    return tituloConta;
}
public String getNumeroCartao() {
    return numeroCartao;
}
public String getSenha() {
    return senha;
}


}

