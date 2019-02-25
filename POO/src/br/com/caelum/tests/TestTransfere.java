package br.com.caelum.tests;

import br.com.caelum.models.Conta;

public class TestTransfere {

	public static void main(String[] args) {
		Conta contaDoBatman = new Conta();
		contaDoBatman.deposita(100);
		
		
		Conta contaDoRobin = new Conta();
		contaDoRobin.deposita(200);
		
		System.out.println(contaDoBatman.getSaldo());
		System.out.println(contaDoRobin.getSaldo());
		
		contaDoRobin.transfere(100, contaDoBatman);
		
		System.out.println(contaDoBatman.getSaldo());
		System.out.println(contaDoRobin.getSaldo());
	}

}
