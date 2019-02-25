package br.com.caelum.tests;

import br.com.caelum.models.Conta;

public class TestSaqueNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(200);
	}
}