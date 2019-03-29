package br.com.alura.maven;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Produto produto = new Produto("Stadia", 1000.0);
	
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
	}
}
