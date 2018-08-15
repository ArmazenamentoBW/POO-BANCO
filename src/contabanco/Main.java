/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import java.util.Scanner;
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
        Scanner ler = new Scanner(System.in);
        System.out.printf("Nome: ");
        C1.setNome(ler.next());//("Bruno Morreto");
        System.out.printf("Numero: ");
        C1.setNumero(ler.nextInt());
        System.out.printf("Agencia: ");
        C1.setAgencia(ler.nextInt());
        System.out.printf("Limite: ");
        C1.setLimite(ler.nextDouble());
        C1.setSaldo();
   
        System.out.println("Desejaaaaa depositar quantos??");
        C1.depositar(ler.nextDouble());
        C1.imprimir();                                                                                                                                                                         
    }
    
}