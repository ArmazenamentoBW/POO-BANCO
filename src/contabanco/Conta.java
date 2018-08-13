/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author 20171bsi0367
 */
public class Conta {
    
    String nome;
    double Saldo;
    double limite;
    int Agencia;
    int numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        if (nome.length() <= 30){
            this.nome = nome;
            
            
        }
    }
    public void setSaldo(double valor){
        this.Saldo = valor;
    }
    
     public void setNumero(int valor){
        this.numero = valor;
        
    }
    
    public void sacar (double valor){
        this.Saldo -= valor;
    }
    
    public void depositar (double valor){
        this.Saldo += valor;
    }
    
    public void imprimir (){
        System.out.println("Prezado, "+ nome);
        System.out.println("Seu saldo atual é: R$ "+ Saldo);
    }

    
}
