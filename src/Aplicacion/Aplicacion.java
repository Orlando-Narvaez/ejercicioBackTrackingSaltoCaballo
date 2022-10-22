package Aplicacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Model.SaltoCaballo;

public class Aplicacion {

	public static void main(String[] args)
	{
		int x, y;
        boolean solucion;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Posicion inicial del caballo. ");
            System.out.print(" x = ");
            x = Integer.parseInt(entrada.readLine());
            System.out.print(" y = ");
            y = Integer.parseInt(entrada.readLine());
            SaltoCaballo miCaballo = new SaltoCaballo(x, y);
            solucion = miCaballo.resolverProblema();
            if (solucion) {
                miCaballo.escribirTablero();
            }
        } catch (Exception m) {
            System.out.println("No se pudo probar el algoritmo, " + m);
        }
	}

}