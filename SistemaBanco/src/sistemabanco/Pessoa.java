/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;

/**
 *
 * @author Felipe Marques
 */
public class Pessoa {
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private Data dataDeNascimento;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void setEndereco(String logradouro, String complemento, int cep, String cidade, String estado){
        this.endereco = new Endereco(logradouro, complemento, cep, cidade, estado);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void imprimir() {
        System.out.println("+----------------------------------+");
        System.out.println("Nome: " + nome);
        System.out.println("+----------------------------------+");
    }

    void setEndereco(String mariz_e_Barros, String ap_301, int i, String pelotas, String rs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
