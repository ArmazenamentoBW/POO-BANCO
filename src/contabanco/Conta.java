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
    //Atributos da clase
    private String nome;
    private double saldo;
    private double limite;
    private int agencia;
    private int numero;
    
    //Construtores
    public void setLimite(double valor){
        this.limite =  valor;
    }
    
    public void setAgencia(int valor){
        this.agencia =  valor;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
        if (nome.length() <= 30){
            this.nome = nome;
            
        }
    }
    public void setSaldo(){
        this.saldo = 0;
    }
    
     public void setNumero(int valor){
        this.numero = valor;
        
    }
    
     //Metodos
    public void sacar (double valor){
        this.saldo -= valor;
    }
    
    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public void imprimir (){
        System.out.println("Prezado, "+ nome);
        System.out.println("Seu saldo atual é: R$ "+ saldo);
    }

    
}
