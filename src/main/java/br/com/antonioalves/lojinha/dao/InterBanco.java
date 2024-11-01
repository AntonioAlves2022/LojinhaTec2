/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.antonioalves.lojinha.dao;

/**
 *
 * @author Professor
 */
public interface InterBanco {
    public boolean create();
    public boolean read();
    public boolean update();
    public boolean delete();
    public boolean findAll();
    public boolean findById(int id );
}
