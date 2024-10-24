/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.antonioalves.lojinha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author professor
 */
public class Conexao {
    //Altere a porta de 3308 para 3306
    private static final String SERVER_MYSQL = "jdbc:mysql://localhost:3308/lojinha";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    // Altere a senha para de 231281 para mysql
    private static final String PASSWORD = "231281";
    
   
    public static Connection getConnection() throws SQLException{
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(SERVER_MYSQL, USER, PASSWORD);
        }catch(ClassNotFoundException ex){
            throw new SQLException("Erro de conexão com o Servidor.");
        }
    }
    
    public static void main(String[] args){
        try{
            Connection conn = Conexao.getConnection();
            JOptionPane.showMessageDialog(null,
                    "Conexão realizada com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    
}
