package br.com.alura.financas.teste;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

import javax.persistence.EntityManager;

public class TesteConta {
    public static void main(String[] args) {
            Conta conta = new Conta();

            conta.setTitular("Jack White");
            conta.setBanco("Banco do Brasil");
            conta.setAgencia("1234");
            conta.setNumero("4321");

            EntityManager em = new JPAUtil().getEntityManager();

            em.getTransaction().begin();
            em.persist(conta);
            em.getTransaction().commit();

            em.close();
    }
}
