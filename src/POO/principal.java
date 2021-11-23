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
public class principal {
    
    public static void main(String[] args) {
        
    Carro carro = new Carro ();    
       
    carro.setCor("Azul");
    carro.setNumPortas(4);
    carro.setPlaca("abc 1234");
    carro.setTipo("Fusca");
    
       
    
    Pessoa pessoa = new Pessoa();
    
    pessoa.setNome("Fernando");
    pessoa.setAltura("1:69");
    pessoa.setCorDaPele("Branco");
    pessoa.setRaça("Brasileiro");
    
     pessoa.imprimeDadosDaPessoa();
    carro.imprimeDadosCarro();
    } 
    
    
    
 
 
      
      
      
}
