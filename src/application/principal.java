package application;

import java.util.Scanner;

import entities.conta;
import models.exceptions.BankException;

public class principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Entre com os dados da conta: ");

			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.print("Cliente: ");
			String cliente = sc.next();
			System.out.print("Saldo: ");
			double saldoInicial = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limite = sc.nextDouble();

			conta cc = new conta(numero, cliente, saldoInicial, limite);
			
			System.out.print("Entre com o valor de saque: ");
			double saqueNow = sc.nextDouble();
			
			cc.setSaque(saqueNow);
			
			System.out.print("Saldo atual: R$ " + cc.getSaldo());		
			

		} 
		
		catch (BankException e) {
			System.out.println("Atenção! " + e.getMessage());
		}
		
		sc.close();

	}

}
