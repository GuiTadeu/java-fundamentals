package br.com.caelum.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    public void add(Empresa empresa){
        lista.add(empresa);
    }

    public List<Empresa> read(){
        return lista;
    }
}
