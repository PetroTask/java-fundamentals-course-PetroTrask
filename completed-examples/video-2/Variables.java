/**
 * Lección 2: Variables y tipos de datos
 * 
 * EJERCICIO RESUELTO: Declaración y uso de diferentes tipos de variables en
 * Java
 * 
 * CONCEPTOS:
 * - int: números enteros
 * - String: cadenas de texto (entre comillas)
 * - double: números decimales
 * - boolean: valores true o false
 * - Las variables deben declararse con un tipo antes de usarse
 */

public class Variables {
  public static void main(String[] args) {
    // Declaramos una variable edad de tipo int (número entero)
    int edad = 15;

    // Declaramos una variable nombre de tipo String (texto)
    String nombre = "María";

    // Declaramos una variable altura de tipo double (número decimal)
    double altura = 1.65;

    // Declaramos una variable esEstudiante de tipo boolean (verdadero/falso)
    boolean esEstudiante = true;

    // Imprimimos todas las variables
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Altura: " + altura + " metros");
    System.out.println("¿Es estudiante?: " + esEstudiante);

    // También podemos hacer operaciones
    int añoNacimiento = 2025 - edad;
    System.out.println("Año de nacimiento aproximado: " + añoNacimiento);
  }
}
