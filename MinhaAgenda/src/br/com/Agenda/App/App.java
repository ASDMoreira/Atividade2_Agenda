package br.com.Agenda.App;

import br.com.Agenda.Classes.Agenda;
import br.com.Agenda.Classes.Pessoa;
import br.com.Agenda.Classes.Telefone;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sosly
 */
public class App {
    
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        Agenda agenda = new Agenda();
        Pessoa pessoa = new Pessoa();
        
        agenda.adicionar("Ana Soslyne");
        
    }
    
}
