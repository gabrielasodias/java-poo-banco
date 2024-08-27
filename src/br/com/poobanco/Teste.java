package br.com.poobanco;

public class Teste {

	public static void main(String[] args) {
		
		Conta corrente = new Conta();
		corrente.depositar(35.0);
		corrente.setAgencia(123);
		corrente.setNumero(323);
		
		corrente.depositar(1000);
		 
		System.out.println(corrente.getSaldo());
		
		Conta poupanca = new Conta(312, 213, 234);
		poupanca.retirar(45);
		
		System.out.println(poupanca.getSaldo());
		
	}
}
