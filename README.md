# Simulador de Banco em Java

Este projeto é um simulador básico de um sistema bancário, desenvolvido em Java com o objetivo de praticar conceitos de Programação Orientada a Objetos (POO). O sistema permite criar clientes e contas bancárias, realizar operações de depósito e retirada, e verificar o saldo.

## 📄 Estrutura do projeto

O projeto contém as seguintes classes principais:

### `Cliente.java`

A classe `CLiente` representa um cliente do banco, contendo os seguintes atributos e métodos:
- Atributos:
  - `String nome` - Nome do cliente
- Métodos:
  - `getNome()` - Retorna o nome do cliente.
  - `setNome(String nome)` - Define o nome do cliente

### `Conta.java`

A classe `Conta` abstrai uma conta bancária e inclui atributos e métodos para realizar operações bancárias. Cada conta possui um cliente associado.
- Atributos
  - `ínt numero` - Número da conta.
  - `int agencia`- Número da agência.
  - `double saldo`- Saldo da conta.
  - `Cliente cliente`- Cliente associado à conta.
- Construtores
  - `Conta()` - Construtor vazio.
  - `Conta(int numero, int agencia, double saldo)` - Construtor que inicializa o número, a agência e o saldo da conta.
- Métodos
  - `getNumero()` e `setNumero(int numero)` - Obtém e define o número da conta.
  - `getAgencia()` e `setAgencia(int agencia)` - Obtém e define o número da agência.
  - `depositar(double valor)` - Adiciona um valor ao saldo da conta.
  - `retirar(double valor)` - Subtrai um valor do saldo da conta.
  - `getSaldo()` - Retorna o saldo atual da conta.

### `Teste.java`

A classe `Teste` executa operações para verificar o funcionamento do sistema bancário:
1. Cria uma conta do tipo corrente, realiza depósitos e define os valores de número da conta e agência.
2. Cria uma conta do tipo poupança com valores iniciais para número, agência e saldo.
3. Realiza operações de depósito e retirada, e imprime os saldos das contas para verificação.

## 📍 Requisitos

- Java 8 ou superior.

## 📌 Como executar

1. Clone o repositório
2. Compile as bases do projeto:
   
   ```bash
     javac -d bin src/br/com/poobanco/*.java
   ```
3. Execute a classe `Teste` para rodar o simulador de banco:
   
   ```bash
     java -cp bin br.com.poobanco.Teste
   ```
### Exemplo de saída
A execução do projeto exibirá o saldo das contas após as operações de depósito e retirada, conforme definido na classe `Teste`.

## ❗ Observações
Este projeto é um exemplo educativo que visa ilustrar o uso de POO em Java. Não é indicado para uso em produção.


