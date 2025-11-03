/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_lembretes;

/**
 *
 * @author aluno
 */
public class Lembrete {
    private String nome;
    private String descricao;
    private Data data;
    
    public Lembrete(String nome, String descricao, Data data){
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }
    
    public Lembrete(String nome, String descricao){
        this(nome, descricao, new Data());
    }
    
    public void imprimir(){
        System.out.println("############################################");
        System.out.print(nome + "  |  " );
        data.imprimir();
        System.out.println(descricao);
        System.out.println("############################################");

    }
    
    public Data getData(){
        return data;
    }
    
    public String getNome(){
        return nome;
    }
}
