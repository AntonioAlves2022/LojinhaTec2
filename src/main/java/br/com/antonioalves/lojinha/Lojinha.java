/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.antonioalves.lojinha;

import br.com.antonio.lojinha.banco.DatabaseMigrations;
import br.com.antonioalves.lojinha.dao.UsuarioDao;
import br.com.antonioalves.lojinha.entidades.Produto;
import br.com.antonioalves.lojinha.entidades.Usuario;
import br.com.antonioalves.lojinha.gui.JFMenu;
import javax.swing.JFrame;


/**
 *
 * @author professor
 */
public class Lojinha {

    public static void main(String[] args) throws Exception{
  
        JFMenu menu = new JFMenu();
        menu.setTitle("Sistema de gestão de loja");
        menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        menu.setVisible(true);
        
        
    }
}
