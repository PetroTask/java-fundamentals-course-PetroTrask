/**
 * Lección 3: Estructuras de control - Decisiones y bucles
 * 
 * EJERCICIO RESUELTO: Uso de if-else, bucles for y while
 * 
 * CONCEPTOS:
 * - if-else: toma decisiones basadas en condiciones
 * - for: repite código un número determinado de veces
 * - while: repite código mientras una condición sea verdadera
 * - Operadores de comparación: ==, !=, <, >, <=, >=
 */

public class EstructurasControl {
  public static void main(String[] args) {
    // Parte 1: Decisiones con if-else
    int edad = 16;

    // Verificamos si puede votar
    if (edad >= 18) {
      System.out.println("Tienes " + edad + " años. ¡Puedes votar!");
    } else {
      System.out.println("Tienes " + edad + " años. Aún no puedes votar.");
      int añosRestantes = 18 - edad;
      System.out.println("Te faltan " + añosRestantes + " años.");
    }

    System.out.println("---");

    // Parte 2: Bucle for
    System.out.println("Números del 1 al 10:");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println("---");

    // Parte 3: Bucle while
    System.out.println("Cuenta regresiva:");
    int contador = 5;
    while (contador > 0) {
      System.out.println(contador);
      contador--; // Disminuye el contador en 1
    }
    System.out.println("¡Despegue!");

    System.out.println("---");

    // Ejemplo adicional: if-else if-else
    int nota = 85;
    if (nota >= 90) {
      System.out.println("Calificación: A - ¡Excelente!");
    } else if (nota >= 80) {
      System.out.println("Calificación: B - ¡Muy bien!");
    } else if (nota >= 70) {
      System.out.println("Calificación: C - Bien");
    } else {
      System.out.println("Calificación: D - Necesitas mejorar");
    }
  }
}
