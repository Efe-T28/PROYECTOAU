/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import entidades.Administrador;
import Logica.ListaRuta;
import Persistencia.RutaDT;
import vista.VistaAdministrador;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Administrador y ListaRuta (puedes personalizar estos datos)
        Administrador administrador = new Administrador("NombreAdmin", "123456", "Dirección", "123456789", "contraseña", "admin");
        ListaRuta listaRuta = new ListaRuta(new RutaDT());

        // Crear una instancia de VistaAdministrador y pasar las instancias de Administrador y ListaRuta
        VistaAdministrador vistaAdmin = new VistaAdministrador(administrador, listaRuta);

        // Mostrar el menú principal para que el administrador interactúe
        vistaAdmin.menuPrincipal();
    }
}
