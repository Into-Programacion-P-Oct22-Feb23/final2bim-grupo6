package trabajo_final;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import paquete01.funciones;
import paquete02.procedimientos;
import paquete03.mensajeN;

public class Trabajo_final {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String mensaje;
        int numero = 0;
        while (bandera == true) {
            numero = numero + 1;
            System.out.println("""
                               1 para crear una cuenta de Facebook
                               2 para crear una cuanta de Twitter
                               3 para crear una cuenta de Whatsapp
                               4 para crear una cuenta de Telegram
                               5 para crear una cuenta de Signal
                               6 para crear una cuenta de Instagram
                               7 para crear una cuenta de Flickr
                               """);
            int num = entrada.nextInt();
            if (num == 1) {
                mensaje = funciones.crearFacebook();
                System.out.println(mensaje);
            } else {
                if (num == 2) {
                    procedimientos.crearTwitter();
                } else {
                    if (num == 3) {
                        mensaje = funciones.crearWhatsapp();
                        System.out.println(mensaje);
                    } else {
                        if (num == 4) {
                            procedimientos.crearTelegram();
                        } else {
                            if (num == 5) {
                                mensaje = funciones.crearSignal();
                                System.out.println(mensaje);
                            } else {
                            }
                            if (num == 6) {
                                procedimientos.crearInstagram();
                            } else {
                            }
                            if (num == 7) {
                                mensaje = funciones.crearFlickr();
                                System.out.println(mensaje);
                            } else {
                                System.out.println("Error numero fuera de "
                                        + "los límites");
                                numero = 0;
                            }
                        }
                    }
                }
            }
            System.out.println("Ingrese 1 para salir");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                bandera = false;
            }
        }
        if (numero > 0) {
            mensaje = mensajeN.obtenerCadena(numero);
            System.out.printf("Con número de cuentas %d es: %s",
                    numero, mensaje);
        }else{
            mensaje = mensajeN.obtenerCadena(0);
            System.out.printf("Con número de cuentas %d es: %s",
                    numero,mensaje);
        }
    }

}
