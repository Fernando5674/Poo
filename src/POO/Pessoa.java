/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Pessoa {
    
    String nome;
    String corDaPele;
    String altura;
    String raça;
    
    void imprimeDadosDaPessoa(){
        
        System.out.println("-----------pessoa-------");
      System.out.println("Nome: "+nome);
       System.out.println("Altura: "+altura);
        System.out.println("corDaPele: "+corDaPele);
         System.out.println("Raça: "+raça);
      
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDaPele() {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
     
    
   
    
   
        
        
    }
    
    
    
    
    

