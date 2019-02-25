package br.com.caelum.models;

// Nao pode instanciar essa classe pq e abstrata
public abstract class Funcionario {
	private String nome;
	private String cpf;
	// publico para os filhos
	private double salario;
	
	//A o colocar um método abstrato em uma classe mãe,
	// obrigamos os filhos a implementar tal método.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
