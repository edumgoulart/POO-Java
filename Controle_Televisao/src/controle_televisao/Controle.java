/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle_televisao;

/**
 *
 * @author aluno
 */
public class Controle {
    private Televisao televisaoSincronizada;
    
    public void sincronizarControle(Televisao televisao){
        
        this.televisaoSincronizada = televisao;
        
    }
    
    public void aumentarVolume(){
        televisaoSincronizada.aumentarVolume();
    }
    
    public void diminuirVolume(){
        televisaoSincronizada.diminuirVolume();
    }
    
    public void aumentarCanal(){
        televisaoSincronizada.aumentarCanal();
    }
    
    public void diminuirCanal(){
        televisaoSincronizada.diminuirCanal();
    }
    
    public void mostrarDados(){
        televisaoSincronizada.mostrarDados();
    }
}
