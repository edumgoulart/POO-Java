/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_lembretes;

/**
 *
 * @author aluno
 */
public class BlocoDeLembretes {
    private Lembrete[] lembretes;
    private static int count = 0, tamanho;
    
    public BlocoDeLembretes(int tamanho){
        lembretes = new Lembrete[tamanho];
        this.tamanho = tamanho;
    }
    
    public BlocoDeLembretes(){
        this(10);
    }
    
    public void incluirLembrete(Lembrete lembrete){
        if(count < tamanho){
            lembretes[count] = new Lembrete();
            count++;
        }
    }
}
