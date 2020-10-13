
package br.com.Agenda.Classes;

import java.util.List;

/**
 *
 * @author sosly
 */
public class Pessoa {
     private String nome;
    private List <Telefone> Telefone;
    
    public Pessoa() {
        this.nome = nome;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getTelefone() {
        return Telefone;
    }

    public void setTelefone(List Telefone) {
        this.Telefone = Telefone;
    }
    
}
