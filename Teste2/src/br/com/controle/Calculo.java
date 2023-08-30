/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author andre.cordeiro
 */
public class Calculo {
  private double valor;
  private double valor2;
  double resultado;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    public double somar(){
    resultado = this.valor + this.valor2;
    return resultado;
    }
    public double subtrair(){
      resultado = this.valor - this.valor2;
    return resultado;
    }
    public double dividir(){
     resultado = this.valor / this.valor2;    
     return resultado;
    }
    public double multiplicar(){
        resultado = this.valor * this.valor2;
        return resultado;
    }
    }
