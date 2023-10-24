/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import entidades.Administrador;
import entidades.Ruta;
import Logica.ListaRuta;

import java.util.Scanner;

public class VistaAdministrador {
    private Administrador Administrador;
    private ListaRuta listaRuta;

    public VistaAdministrador(Administrador administrador, ListaRuta listaRuta) {
        this.Administrador = administrador;
        this.listaRuta = listaRuta;
    }

    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║    Menú del Administrador   ║");
            System.out.println("║══════════════════════════════════║");
            System.out.println("║ 1. Modificar precio de ruta ║");
            System.out.println("║ 2. Consultar una ruta       ║");
            System.out.println("║ 3. Mostrar todas las rutas  ║");
            System.out.println("║ 4. Salir                    ║");
            System.out.println("║══════════════════════════════════║");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el salto de línea

            switch (opcion) {
                case 1:
                    modificarPrecioRuta();
                    break;
                case 2:
                    consultarRuta();
                    break;
                case 3:
                    mostrarRutas();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public void modificarPrecioRuta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código de la ruta a modificar: ");
        String codigo = scanner.nextLine();

        Ruta ruta = listaRuta.consultarRuta(codigo);

        if (ruta != null) {
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = scanner.nextDouble();
            Administrador.modificarPrecioRuta(ruta, nuevoPrecio);
            System.out.println("Precio de la ruta modificado exitosamente.");
        } else {
            System.out.println("La ruta no existe.");
        }
    }

    public void consultarRuta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código de la ruta a consultar: ");
        String codigo = scanner.nextLine();
        Ruta ruta = listaRuta.consultarRuta(codigo);
        
        if (ruta != null) {
        System.out.println("Información de la ruta consultada:");
        System.out.println("Código: " + ruta.getCodigo());
        System.out.println("Origen: " + ruta.getOrigen());
        System.out.println("Destino: " + ruta.getDestino());
        System.out.println("Hora: " + ruta.getHora());
        System.out.println("Fecha: " + ruta.getFecha());
        System.out.println("Precio: " + ruta.getPrecio());
    } else {
        System.out.println("La ruta no existe.");
    }
 }

    public void mostrarRutas() {
        listaRuta.mostrarRutas();
    }
}

