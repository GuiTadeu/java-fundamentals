package br.com.caelum.tests;

import br.com.caelum.models.Cliente;
import br.com.caelum.models.Conta;

public class TestBanco {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Guilherme");
		cliente.setCpf("123456789");
		cliente.setProfissao("Desenvolvedor Java");
		
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.deposita(1500);
		
		contaDoGuilherme.setTitular(cliente);
		
		System.out.println(contaDoGuilherme.getTitular().getProfissao());
	}

}
