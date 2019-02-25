package br.com.caelum.tests;

import br.com.caelum.models.Conta;

public class TestCriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());

	}

}
