/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.antonioalves.lojinha.dao;

import br.com.antonioalves.lojinha.Conexao;
import br.com.antonioalves.lojinha.entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Professor
 */
public class UsuarioDao implements InterBanco {

    //isto é um atributo (variavel da classe)
    private Usuario usuario;

    //parametro de método (dentro dos parenteses)
    public UsuarioDao(Usuario user) {
        this.usuario = user;
    }

    @Override
    public boolean create() {
        boolean sucesso = false;
        try {
            String query = "insert into usuarios ";
            query = query + "(nome, email, senha, ";
            query = query + "endereco, cidade, estado) ";
            query = query + "values(?,?,?,?,?,?)";

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getSenha());
            pst.setString(4, usuario.getEndereco());
            pst.setString(5, usuario.getCidade());
            pst.setString(6, usuario.getEstado());
            pst.executeUpdate();
            sucesso = true;
        } catch (SQLException ex) {
            sucesso = false;
            System.out.println(ex.getMessage());
        }
        return sucesso;
    }

    @Override
    public boolean read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Método getList - usado para carregar os dados em um JTable
    public static ArrayList<Usuario> getList() {
        String sql = "SELECT id, nome, email, cidade, estado FROM usuarios";
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            // identifica qtas linhas e colunas tem na tabela
            //Para cada linha montaremos um registro
            while (rs.next()) {
                Usuario user = new Usuario(); // objeto null (vazio)
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setCidade(rs.getString("cidade"));
                user.setEstado(rs.getString("estado"));

                usuarios.add(user);

            }
            return usuarios;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
}
