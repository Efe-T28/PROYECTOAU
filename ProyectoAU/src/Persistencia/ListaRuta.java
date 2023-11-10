
package Persistencia;

import Logica.LogicaRuta;
import entidades.Ruta;
import java.util.List;


public class ListaRuta implements LogicaRuta {
    public List<Ruta> rutas;

    public ListaRuta(IGuardadoRuta rutaDT) {
        this.rutas = rutaDT.mostrarRuta();
    }

    @Override
    public Ruta consultarRuta(String codigo) {
        for (Ruta ruta : rutas) {
            if (ruta.getCodigo() == Integer.parseInt(codigo)) {
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

    @Override
    public void eliminarRuta(int codigoRuta) {
        Ruta rutaAEliminar = null;
        for (Ruta ruta : rutas) {
            if (ruta.getCodigo() == codigoRuta) {
                rutaAEliminar = ruta;
                break;
            }
        }
        if (rutaAEliminar != null) {
            rutas.remove(rutaAEliminar);
        }
    }
    }

    
