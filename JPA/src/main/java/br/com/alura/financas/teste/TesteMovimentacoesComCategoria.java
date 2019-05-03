package br.com.alura.financas.teste;

import br.com.alura.financas.modelo.Categoria;
import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.modelo.Movimentacao;
import br.com.alura.financas.modelo.TipoMovimentacao;
import br.com.alura.financas.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Arrays;
import java.util.Calendar;

public class TesteMovimentacoesComCategoria {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setId(1012);

        Categoria categoria1 = new Categoria();
        categoria1.setNome("Viagem");

        Categoria categoria2 = new Categoria();
        categoria2.setNome("Negócios");

        Movimentacao movimentacao1 = new Movimentacao();
        movimentacao1.setData(Calendar.getInstance());
        movimentacao1.setDescricao("Viagem a SP");
        movimentacao1.setTipo(TipoMovimentacao.SAIDA);
        movimentacao1.setValor(new BigDecimal(100.0));
        movimentacao1.setCategoria(Arrays.asList(categoria1, categoria2));

        movimentacao1.setConta(conta);

        Movimentacao movimentacao2 = new Movimentacao();
        movimentacao2.setData(Calendar.getInstance());
        movimentacao2.setDescricao("Viagem a RJ");
        movimentacao2.setTipo(TipoMovimentacao.SAIDA);
        movimentacao2.setValor(new BigDecimal(200.0));
        movimentacao2.setCategoria(Arrays.asList(categoria1, categoria2));

        movimentacao2.setConta(conta);

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        em.persist(categoria1);
        em.persist(categoria2);

        em.persist(movimentacao1);
        em.persist(movimentacao2);

        em.getTransaction().commit();
        em.close();


    }
}
