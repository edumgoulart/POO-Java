/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_lembretes;

/**
 *
 * @author aluno
 */
public class Data {
    private int d, m, a;
    
    public Data(int d, int m, int a){
        this.d = d;
        this.m = m;
        this.a = a;
    }
    
    public Data(){
        this(1,1,2000);
    }
    
    public void imprimir(){
        System.out.println("Data: " + d + "/" + m + "/" + a);
    }
    
    public int getDia(){
        return d;
    }
    
    public int getMes(){
        return m;
    }
    
    public int getAno(){
        return a;
    }
    
}
