/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import entidades.Usuario;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public interface Iusuario {
    public void agregarUsuario(Usuario T);
    public ArrayList<Usuario> mostrarDatos();
    public Usuario consultarUsuario(String infoUsuario);
}
