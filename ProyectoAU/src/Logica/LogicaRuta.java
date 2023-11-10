
package Logica;

import entidades.Ruta;

public interface LogicaRuta {
    Ruta consultarRuta(String codigo);
    void mostrarRutas();
    void eliminarRuta(int codigoRuta);
    
}
