/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.antonioalves.lojinha.entidades;

/**
 *
 * @author professor
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int idCategoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws Exception {
        if(preco <= 0){
            throw new Exception("O preço deve ser maior que zero!");
        }
        this.preco = preco;
    }
    
    // Sobrescrita (Override) de métodos
    public void setPreco(double preco, double desconto) throws Exception{
        if(preco <= 0){
            throw new 
        Exception("O preço deve ser maior que zero!");
        }
        this.preco = preco * (1 - desconto);
        
    }
    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    public void showInfo(){
        System.out.println("Produto:"+ this.nome);
        System.out.println("Preço: R$ "+ this.preco);
        System.out.println("Descrição:"+this.descricao);
    }
    
    
}
