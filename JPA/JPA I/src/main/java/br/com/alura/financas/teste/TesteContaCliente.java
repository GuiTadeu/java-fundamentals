package br.com.alura.financas.teste;

import br.com.alura.financas.modelo.Cliente;
import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

import javax.persistence.EntityManager;

public class TesteContaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setEndereco("Rua dos Bobos, Nº 0");
        cliente.setProfissao("Desenvolvedor");

        Conta conta = new Conta();
        conta.setId(2);

        cliente.setConta(conta);

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        em.persist(cliente);

        em.getTransaction().commit();
    }
}
