# Pix Impresso
## Etapas de uma operação de saque


1 - Ir até um caixa eletronico
2 - Inserir 0 Cartão 
3 - Inserir a senha
4 - Validar a Senha 
5 - Informar o valor do saque 
6 - Validar se o caixa possui saldo
7 - Validar se a conta possui saldo
8 - Liberar o dinheiro para o cliente 
9 - Registrar a Transação
10 - Encerrar a operação


## Classes


### Conta
- IdConta
- numero
- agencia
- digitoVerificador
- nome
- CPF
- tituloConta
- numeroCartao (1 - C.Corrente / 2 - C.Salario / 3 - C.Poupança)
- senha

### Caixa Eletronico
- idCaixaEletronico
- localizacao
- saldo


### Transacao
- idTransacao
- dataHora
- valor
- tipoTransacao (C - Credito / D - Debito)
- idConta 
- idCaixaEletronico



