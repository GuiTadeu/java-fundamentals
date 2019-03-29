package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	Produto bala = new Produto("Juquinha", 0.10);
	
	@Test
	public void verificaPrecoComImposto() {
		assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
	}
	
	@Test
	public void testGetNome() {
		assertEquals("Juquinha", bala.getNome());
	}
	
	@Test
	public void testGetPreco() {
		assertEquals(0.10, bala.getPreco(), 0);
	}
}
