package br.com.caelum.models;

// Classe fantoche, modelo amenico

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Atributo da Classe, não do objeto
	private static int total;
	
	public Conta(){
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
	}
	
	public Conta(int agencia, int numero){
		
	}
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor){
			this.saldo = this.saldo - valor;
			return true;
		} 
		
		return false;

	}
	
	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor){
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0){
			System.out.println("DEU RUIM");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0){
			System.out.println("DEU RUIM!");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal(){
		return Conta.total;
	}
}
