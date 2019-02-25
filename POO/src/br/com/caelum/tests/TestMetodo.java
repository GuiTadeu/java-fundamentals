package br.com.caelum.tests;

import br.com.caelum.models.Conta;

public class TestMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(20);
		System.out.println(conta.getSaldo());
		
		boolean conseguiuRetirar = conta.saca(20);
		
		System.out.println(conseguiuRetirar);
	}
}
