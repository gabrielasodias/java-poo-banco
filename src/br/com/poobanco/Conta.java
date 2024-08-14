package br.com.poobanco;

/**
 * Classe que abstrai uma conta bancária
 * @author gabrieladias
 * @version 1.0
 */
public class Conta {
	
	/**
	 * Número da conta
	 */
	int numero;
	
	/**
	 * Número da agência
	 */
	int agencia;
	
	/**
	 * Saldo da conta
	 */
	double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	/**
	 * Deposita um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return Valor do saldo da conta
	 */
	public double verificarSaldo() {
		return saldo;
	}
}
