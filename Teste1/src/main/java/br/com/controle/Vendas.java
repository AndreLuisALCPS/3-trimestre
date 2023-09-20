/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;
/**
 *
 * @author andre.cordeiro
 */
public class Vendas {
private double valor;
private double valor2;
double maior;
double totalVend;

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


  public double maior(){
    if(valor > maior){  
     maior = valor;   
    }
    if(valor2 > maior){
     maior = valor2;   
    }
    return maior;
}
  
  public double totalVend(){
      totalVend = 0;
   totalVend =(this.valor + this.valor2); 
    return totalVend;
  }
}