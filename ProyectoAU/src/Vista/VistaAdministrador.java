/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import entidades.Administrador;
import entidades.Ruta;
import Persistencia.ListaRuta;

import java.util.Scanner;

public class VistaAdministrador {
    private Administrador Administrador;
    private ListaRuta listaRuta;
    
    public void muestraMenu(){
        System.out.println("**********************");
        System.out.println(" [ RUTA SEGURA ]    ");
        System.out.println("**********************");
        System.out.println("---------------------------");
        System.out.println(" 1. Inicio de sesion administrador ");
        System.out.println(" 2. Entrar como cliente ");
        System.out.println(" 3. Entrar como conductor ");
        System.out.println(" 4. Salir del programa \n ");
    }
    
       public void ejecutarMenu() {
        int op;
        do {
            this.muestraMenu();
            op = LectorDatos.leerInt("Seleccione una opcion");
            switch (op) {
                case 1:
                    this.menuPrincipal();
                    break;
                case 2:
                    //this.listaDeRutas();
                    break;
                case 3:
                    //this.opBuscarRuta();
                    break;
                case 4:
                    System.out.println("Ha sido un placer, cerrando programa...");
                    break;
                default:
                    System.out.println("!! Opcion no valida ¡¡\n");

            }

        } while (op != 4);

    }
        
     public VistaAdministrador(Administrador administrador, ListaRuta listaRuta) {
        this.Administrador = administrador;
        this.listaRuta = listaRuta;
    }
    
     
    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();
        
        while (!salir) {

        if (contraseña.equals(Administrador.getContraseña())) {
        System.out.println("Inicio de sesión correcto.");
         } else {
        System.out.println("Contraseña incorrecta.");
        }

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

