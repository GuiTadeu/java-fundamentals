package br.com.caelum.model;

import java.util.Date;

public class Empresa {

    private Integer id;
    private String nome;
    private Date abertura = new Date();

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAbertura() {
        return abertura;
    }

    public void setAbertura(Date abertura) {
        this.abertura = abertura;
    }
}
