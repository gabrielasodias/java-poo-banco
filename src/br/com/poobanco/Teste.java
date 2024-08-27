package br.com.poobanco;

public class Teste {

	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.saldo = 50;
		cc.agencia = 123;
		cc.numero = 323;
		
		cc.depositar(100);
		
		cc.cliente.nome = "Gabriela";
		cc.cliente.idade = 19;
		
		System.out.println(cc.cliente.nome);
		System.out.println(cc.cliente.idade);
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000);
		
		poupanca.cliente.nome = "Luiz";
		poupanca.cliente.idade = 45;
		
		System.out.println(poupanca.cliente.nome);
		System.out.println(poupanca.cliente.idade);
		
		poupanca.retirar(50);
		
		System.out.println(poupanca.verificarSaldo());
		
	
	}
}
