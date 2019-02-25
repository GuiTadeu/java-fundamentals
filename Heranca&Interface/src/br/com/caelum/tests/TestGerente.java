package br.com.caelum.tests;

import br.com.caelum.models.Gerente;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Jubileu");
		gerente.setCpf("66");
		gerente.setSalario(50);
		gerente.setSenha(1234);
		
		gerente.autentica(1234);
	}
}
