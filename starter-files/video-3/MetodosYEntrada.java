
/**
 * Lección 4: Métodos, Entrada/Salida e Introducción a la POO
 * 
 * EJERCICIO: Completa este programa para crear métodos y usar Scanner
 * 
 * INSTRUCCIONES:
 * 1. Completa el método saludar() para que imprima un saludo
 * 2. Completa el método sumar() para que devuelva la suma de dos números
 * 3. Usa Scanner para leer el nombre del usuario
 * 4. Completa la clase básica Persona con un atributo nombre
 */

import java.util.Scanner;

public class MetodosYEntrada {
  // TODO: Completa el método saludar que no devuelve nada (void)
  public static void saludar(String nombre) {

  }

  // TODO: Completa el método sumar que devuelve la suma de dos números
  public static int sumar(int a, int b) {

  }

  public static void main(String[] args) {
    // Parte 1: Usando métodos
    saludar("Juan");

    int resultado = sumar(5, 3);
    System.out.println("La suma es: " + resultado);

    System.out.println("---");

    // Parte 2: Entrada del usuario con Scanner
    Scanner scanner = new Scanner(System.in);

    // TODO: Pide al usuario su nombre y guárdalo en una variable
    System.out.print("¿Cuál es tu nombre? ");

    // TODO: Saluda al usuario con su nombre

    scanner.close();
  }
}

// TODO: Completa esta clase básica
class Persona {
  // TODO: Declara un atributo 'nombre' de tipo String

}
