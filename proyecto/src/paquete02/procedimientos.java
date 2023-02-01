/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class procedimientos {

    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String idioma;
        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma:");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();
        System.out.printf("""
                          Nombre de usuario: %s
                          Nombres: %s
                          Apellidos: %s
                          Edad: %d
                          Ciudad: %s
                          Pais: %s
                          Idioma: %s
                          Correo electronico: %s
                          """, nombreUsuario, nombre, apellido, edad, ciudad,
                pais, idioma, correo);
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        int edad;
        String ciudad;
        String pais;
        int telefono;
        String interes;
        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su área de interés:");
        interes = entrada.nextLine();
        System.out.printf("""
                          Nombre de usuario: %s
                          Numero de celular:: %d
                          Edad: %d
                          Ciudad: %s
                          Pais: %s
                          Area de interes: %s
                          """, nombreUsuario, telefono,
                edad, ciudad, pais, interes);
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        int edad;
        String ciudad;
        String correo;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();
        System.out.printf("""
                          Nombre de usuario: %s
                          Edad: %d
                          Ciudad: %s
                          Correo electronico: %s
                          """, nombreUsuario,
                edad, ciudad, correo);
    }
}
