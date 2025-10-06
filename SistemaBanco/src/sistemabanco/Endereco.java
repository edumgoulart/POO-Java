/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabanco;

/**
 *
 * @author eduardo
 */
public class Endereco {
    private String logradouro;
    private String complemento;
    private int cep;
    private String cidade;
    private String estado;
    
    public Endereco(String logradouro, String complemento, int cep, String cidade, String estado){
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.logradouro = logradouro;
    }
}
