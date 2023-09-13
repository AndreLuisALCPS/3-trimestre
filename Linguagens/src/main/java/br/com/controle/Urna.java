/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.controle;

/**
 *
 * @author andre.cordeiro
 */
public class Urna {
private int voto;
int java;
int c;

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
        if(this.voto==1){
            java++;}
         if(this.voto==2){
            c++;}
        
    }
}