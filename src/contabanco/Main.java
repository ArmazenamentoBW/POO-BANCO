/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import javax.swing.JOptionPane;

/**
 *
 * @author 20171bsi0367
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta C1 = new Conta();
        String nomeC = JOptionPane.showInputDialog(null,"nome cliente");
        C1.setNome(nomeC);//("Bruno Morreto");
        String nconta;
        nconta = JOptionPane.showInputDialog(null,"Nº da conta");
        int numeroConta = Integer.parseInt(nconta);
        C1.numero = numeroConta;
        String agenc = JOptionPane.showInputDialog(null,"Nº");
        
        
        C1.setSaldo(2000);
        C1.imprimir();                                                                                                                                                                                                                         
        
    }
    
}