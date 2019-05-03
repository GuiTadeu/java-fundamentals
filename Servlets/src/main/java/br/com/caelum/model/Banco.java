package br.com.caelum.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    public void add(Empresa empresa){
        lista.add(empresa);
    }

    public void remove(int id){
        Empresa empresa = buscaPorID(id);
        lista.remove(empresa);
    }

    public void altera(int id, String novoNome){
        Empresa empresa = buscaPorID(id);
        int index = lista.indexOf(empresa);
        empresa.setNome(novoNome);
        lista.set(index, empresa);
    }

    public List<Empresa> read(){
        return lista;
    }

    public Empresa buscaPorID(int id){
        for(Empresa empresa : lista) {
            if(empresa.getId().equals(id)) {
                return empresa;
            }
        }

        return null;
    }
}
