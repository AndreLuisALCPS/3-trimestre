/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import javax.swing.JOptionPane;

/**
 *
 * @author andre.cordeiro
 */
public class objeto {
    public static void main(String[]args){
        Urna u = new Urna();
        for(int cont=0; cont<5; cont++){
          u.setVoto(Integer.valueOf(JOptionPane.showInputDialog(null,"Digite um valor")));
    }
}
}