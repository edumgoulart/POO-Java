/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controle_televisao;

/**
 *
 * @author eduardo
 */
public class Controle_Televisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisao televisao1;
        Controle controle1;
        
        televisao1 = new Televisao();
        controle1 = new Controle();
        controle1.sincronizarControle(televisao1);
        
        controle1.mostrarDados();
        controle1.aumentarVolume();
        televisao1.aumentarCanal();
        controle1.mostrarDados();
    }
    
}
