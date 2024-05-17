package classes;

public class CaixaEletronico {
 private int idCaixaEletronico;
 private String localizacao;
 private Double saldo;


 public CaixaEletronico(int idCaixaEletronico, String localizacao, Double saldo) {
    
    this.idCaixaEletronico = idCaixaEletronico;
    this.localizacao = localizacao;
    this.saldo = saldo;
}


public void setIdCaixaEletronico(int idCaixaEletronico) {
    this.idCaixaEletronico = idCaixaEletronico;
}


public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
}


public void setSaldo(Double saldo) {
    this.saldo = saldo;
}


public int getIdCaixaEletronico() {
    return idCaixaEletronico;
}


public String getLocalizacao() {
    return localizacao;
}


public Double getSaldo() {
    return saldo;
}


}
    

