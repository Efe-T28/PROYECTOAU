/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import entidades.Ruta;

public interface IGuardadoRuta {
    Ruta consultarRuta(String codigo);
    void mostrarRutas();
}
