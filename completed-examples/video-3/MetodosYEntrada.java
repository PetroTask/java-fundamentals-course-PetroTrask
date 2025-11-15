
/**
 * Lección 4: Métodos, Entrada/Salida e Introducción a la POO
 * 
 * EJERCICIO RESUELTO: Métodos, Scanner y clases básicas
 * 
 * CONCEPTOS:
 * - Métodos: bloques de código reutilizables
 * - public static: modificadores del método
 * - void: método que no devuelve valor
 * - return: devuelve un valor
 * - Scanner: lee entrada del usuario
 * - Clase: plantilla para crear objetos
 */

import java.util.Scanner;

public class MetodosYEntrada {
  // Método que no devuelve nada (void), solo imprime
  public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "!");
  }

  // Método que devuelve un valor (int)
  public static int sumar(int a, int b) {
    return a + b;
  }

  // Método que calcula el área de un rectángulo
  public static double calcularArea(double base, double altura) {
    return base * altura;
  }

  public static void main(String[] args) {
    // Parte 1: Usando métodos
    saludar("Juan");
    saludar("María");

    int resultado = sumar(5, 3);
    System.out.println("La suma de 5 + 3 es: " + resultado);

    double area = calcularArea(4.5, 2.0);
    System.out.println("El área del rectángulo es: " + area);

    System.out.println("---");

    // Parte 2: Entrada del usuario con Scanner
    Scanner scanner = new Scanner(System.in);

    System.out.print("¿Cuál es tu nombre? ");
    String nombreUsuario = scanner.nextLine();

    System.out.print("¿Cuántos años tienes? ");
    int edadUsuario = scanner.nextInt();

    // Usamos los datos ingresados
    saludar(nombreUsuario);
    System.out.println("Tienes " + edadUsuario + " años.");

    System.out.println("---");

    // Parte 3: Introducción a clases y objetos
    Persona persona1 = new Persona();
    persona1.nombre = "Carlos";
    persona1.edad = 16;

    System.out.println("Persona creada: " + persona1.nombre + ", " + persona1.edad + " años");

    scanner.close();
  }
}

// Clase básica Persona
class Persona {
  // Atributos (características de una persona)
  String nombre;
  int edad;
}
