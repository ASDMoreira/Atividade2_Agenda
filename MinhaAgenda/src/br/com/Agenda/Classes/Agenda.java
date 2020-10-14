
package br.com.Agenda.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sosly
 */
public class Agenda {
    private List <Pessoa> pessoa;

    public Agenda() {
        this.pessoa = pessoa;
    }
    

    public List getPessoa() {
        return pessoa;
    }

    public void setPessoa(List Pessoa) {
        this.pessoa = Pessoa;
    }
    
    public void adicionar(Pessoa nome, Pessoa telefone){
        pessoa.add(nome);
        pessoa.add(telefone);
        
        
        
    }
    
}
