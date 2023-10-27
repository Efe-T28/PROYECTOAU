/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import entidades.Administrador;
import Persistencia.ListaRuta;
import Persistencia.IGuardadoRuta;
import vista.VistaAdministrador;

public class Main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("NombreAdmin", "123456", "Dirección", "123456789", "contraseña", "admin");
        ListaRuta listaRuta = new ListaRuta(new IGuardadoRuta());
        
        VistaAdministrador vistaAdmin = new VistaAdministrador(administrador, listaRuta);

        
        vistaAdmin.ejecutarMenu();
        vistaAdmin.menuPrincipal();
      
    }
}
