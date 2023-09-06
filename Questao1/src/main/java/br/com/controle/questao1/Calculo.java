/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.controle.questao1;

/**
 *
 * @author andre.cordeiro
 */
public class Calculo {
private double CFabrica;
private double CConsumidor;
double CTotal;
double CTotalN;
    public double getCFabrica() {
        return CFabrica;
    }

    public void setCFabrica(double CFabrica) {
        this.CFabrica = CFabrica;
    }

    public double getCConsumidor() {
        return CConsumidor;
    }

    public void setCConsumidor(double CConsumidor) {
        this.CConsumidor = CConsumidor;
    }


     public double CTotal(){
     CTotal = ((CFabrica*28)*45)/100;
     return CTotal;
}
     public double CTotalN(){
      CTotalN = ((((CFabrica*28)*45)/100)*20)/100;
      return CTotalN;
     }
         
}
