/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.antonioalves.lojinha;

import br.com.antonioalves.lojinha.dao.UsuarioDao;
import br.com.antonioalves.lojinha.entidades.Produto;
import br.com.antonioalves.lojinha.entidades.Usuario;


/**
 *
 * @author professor
 */
public class Lojinha {

    public static void main(String[] args) throws Exception{
        Usuario user = new Usuario();
        user.setNome("Caio Rolando da Rocha");
        user.setEmail("caio.darocha@gmail.com");
        user.setSenha("123456");
        user.setEndereco("Rua Bento Gonçalves, 45");
        user.setCidade("Sapiranga");
        user.setEstado("RS");
        
        UsuarioDao ud = new UsuarioDao(user);
        
        if(ud.create()){
            System.out.println("Usuario cadastrado");
        }else{
            System.out.println("Erro ao cadastrar o usuario");
        }
        
        
    }
}
