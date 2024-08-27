package br.com.poobanco;

import java.io.Serializable;

/**
 * Classe que abstrai uma conta bancária
 * @author gabrieladias
 * @version 1.0
 */
public class Conta implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	/**
	 * Número da conta
	 */
	private int numero;
	
	/**
	 * Número da agência
	 */
	private int agencia;
	
	/**
	 * Saldo da conta
	 */
	private double saldo;
	
	Cliente cliente = new Cliente();
	
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
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
	 * @see depositar
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return Valor do saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}
}
