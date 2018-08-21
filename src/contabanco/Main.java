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
        ContaCorrente C1 = new ContaCorrente();
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
        
        ContaPoupanca C2 = new ContaPoupanca();
        System.out.printf("Nome: ");
        C2.setNome(ler.next());
        System.out.printf("Numero: ");
        C2.setNumero(ler.nextInt());
        System.out.printf("Agencia: ");
        C2.setAgencia(ler.nextInt());
        C2.setSaldo();
        System.out.println("valor para depositar?");
        C2.depositar(ler.nextDouble());
        C2.imprimir();
    }
    
}