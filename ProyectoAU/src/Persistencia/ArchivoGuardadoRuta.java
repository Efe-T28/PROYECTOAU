package Persistencia;

import java.io.*;
import entidades.Ruta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ArchivoGuardadoRuta {
    private static final String ARCHIVO_RUTAS = "rutas.txt"; 

    public List<Ruta> cargarRutas() {
        List<Ruta> rutas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_RUTAS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    String origen = datos[0].trim();
                    String destino = datos[1].trim();
                    LocalTime hora = LocalTime.parse(datos[2].trim());
                    LocalDate fecha = LocalDate.parse(datos[3].trim());
                    int codigo = Integer.parseInt(datos[4].trim());
                    double precio = Double.parseDouble(datos[5].trim());

                    rutas.add(new Ruta(origen, destino, hora, fecha, codigo, precio));
                }
            }
        } catch (IOException e) {
        }

        return rutas;
    }

    public void guardarRutas(List<Ruta> rutas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_RUTAS))) {
            for (Ruta ruta : rutas) {
                String linea = ruta.getOrigen() + "," + ruta.getDestino() + "," +
                              ruta.getHora() + "," + ruta.getFecha() + "," +
                              ruta.getCodigo() + "," + ruta.getPrecio();
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
        }
    }
}
