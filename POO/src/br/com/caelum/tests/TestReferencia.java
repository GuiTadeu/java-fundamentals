package br.com.caelum.tests;

import br.com.caelum.models.Conta;

public class TestReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);
		
		// Referencia, aponta para o mesmo obj
		Conta segundaConta = primeiraConta;
		
		segundaConta.deposita(470);
		
		System.out.println(primeiraConta.getSaldo());
	}
}
