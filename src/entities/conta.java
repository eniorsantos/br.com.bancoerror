package entities;

import models.exceptions.BankException;


public class conta {
	
	private int numero;
	private String cliente;
	private double saldo;
	private double limiteSaque;
	private double saque;
	
	public conta () {
		
	}

	public conta(int numero, String cliente, double saldo, double limiteSaque) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}	

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) throws BankException  {
		if(saque > this.limiteSaque ) {
			throw new BankException ("Valor de saque excede limite contratado! ");				
		}
		
		if(saque > this.saldo ) {
			throw new BankException ("Valor de saque excede saldo disponivel! ");				
		}		
		
		
		this.saldo -= saque;
	}	
	
	public void deposito (double quantia) {
		this.saldo += quantia;
	}
	
	
	public double getLimiteSaque() {
		return limiteSaque;
	}

	

}
