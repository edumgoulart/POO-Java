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
            lembretes[count] = lembrete;
            count++;
        }
    }
    
    public int numeroDeLembretes(){
        return count;
    }
    
    public void removerLembrete(int indice){
        if(indice < 0 || indice > tamanho - 1){
            System.out.println("Esse indice não existe");
            return;
        }
        
        for(int i = indice; i < tamanho - 1; i++){
            lembretes[i] = lembretes[i+1];
            
        }
        lembretes[tamanho - 1] = null;
        count--;
    }
    
    public void listarLembretes(){
        System.out.println("Lembretes do bloco:\n");
        for(int i = 0; i < count; i++){
            System.out.println(i + ".");
            lembretes[i].imprimir();
            System.out.println("");
        }
    }
    
    public void buscarLembretesPorData(Data data){
        System.out.print("Lembretes da data ");
        data.imprimir();
        for(int i = 0; i < count; i++){
            if( lembretes[i].getData().getDia() == data.getDia() &&
                lembretes[i].getData().getMes() == data.getMes() &&
                lembretes[i].getData().getAno() == data.getAno() )
            {
                System.out.println(i + ".");
                lembretes[i].imprimir();
                System.out.println("");
            }
        }
    }
    
    public void buscarLembretesPorNome(String nome){
        System.out.println("Lembres com o nome: " + nome);
        for(int i = 0; i < count; i++){
            if(lembretes[i].getNome().contains(nome)){
                System.out.println(i + ".");
                lembretes[i].imprimir();
                System.out.println("");
            }
        }
    }
}
