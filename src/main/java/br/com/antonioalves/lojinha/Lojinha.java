/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.antonioalves.lojinha;

import br.com.antonioalves.lojinha.entidades.Produto;


/**
 *
 * @author professor
 */
public class Lojinha {

    public static void main(String[] args) throws Exception{
        
        Produto cadeira = new Produto();
        Produto computador = new Produto();
        
        //preparando a cadeira
        cadeira.setNome("Cadeira gamer Pichau");
        cadeira.setDescricao("Cadeira super confortável");
        cadeira.setPreco(900);
        
        
        //preparando o computador
        computador.setNome("Notebook Dell");
        computador.setDescricao("Intel Core I7 de 11º geração, 16GB de RAM");
        computador.setPreco(6000, 0.1);
        
        cadeira.showInfo();
        computador.showInfo();
        
    }
}
