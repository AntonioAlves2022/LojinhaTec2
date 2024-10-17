/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.antonioalves.lojinha.entidades;

/**
 *
 * @author professor
 */
public class Usuario{
    // atrubutos: são as variaveis de uma classe
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String cidade;
    private String estado;
    
    //Getters e setters da classe
    //get: é um metodo de leitura
    //set: é um método de escrita ou gravação

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }
    // Se o nome tiver menos de 3 caracteres, será lançado um erro
    public void setCidade(String cidade) throws Exception {
        if(cidade.length() < 3){
            throw new Exception("O nome deve ter pelo menos 3 letras");
        }
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Método que mostra todas as informações do objeto na tela
    public void showInfo(){
        System.out.println("Id:"+this.id);
        System.out.println("Nome:"+this.nome);
        System.out.println("E-mail:"+this.email);
        System.out.println("Cidade:"+this.cidade);
        System.out.println("Estado:"+this.estado);
    }
    
    
    
    
    
}
