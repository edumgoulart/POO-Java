/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle_televisao;

/**
 *
 * @author aluno
 */
public class Televisao {
    private int volume;
    private int canal;
    
    public Televisao(){
        volume = 15;
        canal = 1;
    }
    
    public Televisao(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }
    
    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        if(volume >= 1){
            volume--;
        }
    }
    
    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        if(canal > 1){
            canal--;
        }
    }
    
    public void mostrarDados(){
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }

}
