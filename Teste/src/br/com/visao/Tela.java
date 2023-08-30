
package br.com.visao;

import javax.swing.JOptionPane;
import br.com.controle.Vendas;



public class Tela {
    public static void main(String args[]) {
         Vendas v = new Vendas();
         v.setValor(Double.valueOf(JOptionPane.showInputDialog("Digite o valor ")));
         v.setParcelas(Integer.valueOf(JOptionPane.showInputDialog("Quantas parcelas")));
         JOptionPane.showMessageDialog(null, "Valor atualizado "+v.valorFinal());
    }
}
