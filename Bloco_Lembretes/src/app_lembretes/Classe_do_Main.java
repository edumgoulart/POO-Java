/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app_lembretes;

/**
 *
 * @author aluno
 */
public class Classe_do_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BlocoDeLembretes b1 = new BlocoDeLembretes();
        b1.incluirLembrete(new Lembrete("Aula de LF", "Hoje tem aula de LF", new Data(16,10,2025)));
        b1.incluirLembrete(new Lembrete("Aula de POO", "Hoje tem aula de POO", new Data(19,10,2025)));
        b1.listarLembretes();
        b1.removerLembrete(0);
        b1.listarLembretes();
        b1.incluirLembrete(new Lembrete("Aula de AOC", "Hoje tem aula de AOC", new Data(16,10,2025)));
        b1.listarLembretes();
        b1.incluirLembrete(new Lembrete("Aula de AED", "Hoje tem aula de AED", new Data(19,10,2025)));
        b1.buscarLembretesPorData(new Data(19,10,2025));
        b1.buscarLembretesPorNome("POO");
    }
    
}
