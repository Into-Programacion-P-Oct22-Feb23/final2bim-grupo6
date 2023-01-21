/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

public class funciones {
    public static String crearFacebook() {
         Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        String nombreUsuario;
        int edad;
        String ciudad;
        String pais;
        String correoElectronico;
        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        //entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correoElectronico = entrada.nextLine();
        mensaje = String.format("""
                                Nombre de usuario: %s
                                Edad: %d
                                Ciudad: %s
                                País: %s
                                Correo electronico: %s
                                """, nombreUsuario, edad, ciudad,
                pais, correoElectronico);
        return mensaje;      
    }
    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        String nombreUsuario;
        int edad;
        String ciudad;
        String pais;
        int numeroCelular;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        numeroCelular = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();

        mensaje = String.format("""
                                Nombre de usuario: %s
                                Numero de celular: %d
                                Edad: %d
                                Ciudad: %s
                                País: %s
                                """, nombreUsuario, numeroCelular, 
                edad, ciudad,pais);
        return mensaje;
    }
     public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        String nombreUsuario;
        int edad;
        String ciudad;
        String pais;
        int numeroCelular;
        String hobby;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        numeroCelular = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su hobby principal:");
        hobby = entrada.nextLine();

        mensaje = String.format("""
                                Nombre de usuario: %s
                                Numero de celular: %d
                                Edad: %d
                                Ciudad: %s
                                Pais: %s
                                Hobby principal: %s
                                """, nombreUsuario, numeroCelular,
                edad, ciudad, pais, hobby);
        return mensaje;

    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String correo;
        String nombreUsuario;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        mensaje = String.format("""
                                Nombre de usuario: %s
                                Correo electronico: %s
                                """, nombreUsuario, correo);
        return mensaje;
    }
}
