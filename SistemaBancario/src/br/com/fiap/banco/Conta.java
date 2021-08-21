package br.com.fiap.banco;

import java.io.Serializable;


public class Conta implements Serializable{
	
	/**
	 * Classe que vai abstrair uma Conta Bancaria 
	 * @author Matheus
	 * @version 1.0
	*/
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(double saldo, int numero, int agencia) {
		
		this.agencia = agencia;
		this.saldo = saldo;
		this.numero = numero;
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Realizar o deposito na conta corrente
	 * @param valor O valor que o usuario quer depositar
	 * @param saldo O valor que o usuaria tem em sua conta
	 * @return retornara o valor do saldo atual mais o valor depositado 
	 */
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		
	}
	
	 /**
	   Realizar o saque na conta corrente
	 * @param valor O valor que o usuario quer sacar
	 * @param saldo O valor que o usuaria tem em sua conta
	 * @return retornara o valor do saldo atual menos o valor do saque
	  */
	public void sacar(double valor) {
		
		this.saldo -= valor;
		
	}
	
	/**
	 * Realizar o retorno do saldo atual
	 * @return retornara o saldo total da conta corrente
	 */
	
	public double getSaldo() {
		
		return this.saldo;
		
	}
}

