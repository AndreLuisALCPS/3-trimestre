/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media;

/**
 *
 * @author andre.cordeiro
 */
public class Media {
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
    
    public double media(){
    resultado = (this.valor + this.valor2)/2;   
    return resultado;
}
}