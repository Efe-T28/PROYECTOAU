/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.RutaDT;
import entidades.Ruta;
import java.util.ArrayList;
import java.util.List;


public class ListaRuta implements IGuardadoRuta {
    private List<Ruta> rutas;

    public ListaRuta(RutaDT rutaDT) {
        this.rutas = rutaDT.mostrarRuta();
    }

    @Override
    public Ruta consultarRuta(String codigo) {
        for (Ruta ruta : rutas) {
            if (ruta.getCodigo() == Integer.parseInt(codigo)) {
                // Puedes mostrar la información de la ruta o devolverla.
                System.out.println("Ruta encontrada: " + ruta.toString());
                return ruta ;
            }
        }
        System.out.println("Ruta no encontrada.");
        return null;
    }

    @Override
    public void mostrarRutas() {
        if(rutas.isEmpty()){
            System.out.println("No hay rutas disponibles.");
        }else{
        for (Ruta ruta : rutas) {
            System.out.println(ruta.toString());
        }
    }
 }
}