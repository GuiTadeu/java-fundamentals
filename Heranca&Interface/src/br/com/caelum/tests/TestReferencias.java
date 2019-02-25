package br.com.caelum.tests;

import br.com.caelum.models.ControleBonificacao;
import br.com.caelum.models.EditorVideo;
import br.com.caelum.models.Funcionario;
import br.com.caelum.models.Gerente;


public class TestReferencias {
    public static void main(String[] args) {

        ControleBonificacao controle = new ControleBonificacao();

        Funcionario g1 = new Gerente();
        g1.setNome("Jubileu");
        String nome = g1.getNome();

        Gerente g2 = new Gerente();
        g2.setNome("Irineu");
        g2.setSalario(01111);

        // Nao e possivel pois funcionario e abstrato
        //Funcionario f = new Funcionario();
        //f.setSalario(2000.0);


        EditorVideo ev = new EditorVideo();


        // Polimorfismo, os objetos assumem que sao
        // Funcionarios mas conseguem usar seus metodos
        // Especificos (getBonificacao());
        controle.registra(g2);
        controle.registra(ev);


    }
}
