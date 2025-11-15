/**
 * Lección 5: Fundamentos de POO - Simulador de Mascotas
 * 
 * EJERCICIO RESUELTO: Simulador completo usando Programación Orientada a
 * Objetos
 * 
 * CONCEPTOS DE POO:
 * - Clase: plantilla para crear objetos (Mascota)
 * - Objeto: instancia de una clase (miMascota)
 * - Atributos: características del objeto (nombre, energia, felicidad)
 * - Métodos: acciones que puede realizar el objeto (alimentar, jugar)
 * - Encapsulación: atributos privados con getters/setters
 * - Constructor: método especial para inicializar objetos
 */

public class SimuladorMascotas {
  public static void main(String[] args) {
    System.out.println("=== SIMULADOR DE MASCOTAS ===\n");

    // Creamos un objeto Mascota usando el constructor
    Mascota miMascota = new Mascota("Firulais", "Perro", 50, 70);

    // Mostramos el estado inicial
    miMascota.mostrarEstado();
    System.out.println();

    // Interactuamos con la mascota
    System.out.println(">>> Alimentando a " + miMascota.getNombre() + "...");
    miMascota.alimentar();
    miMascota.mostrarEstado();
    System.out.println();

    System.out.println(">>> Jugando con " + miMascota.getNombre() + "...");
    miMascota.jugar();
    miMascota.mostrarEstado();
    System.out.println();

    System.out.println(">>> " + miMascota.getNombre() + " está durmiendo...");
    miMascota.dormir();
    miMascota.mostrarEstado();
    System.out.println();

    // Creamos otra mascota para demostrar múltiples objetos
    Mascota otraMascota = new Mascota("Michi", "Gato", 40, 60);
    System.out.println("--- Nueva mascota ---");
    otraMascota.mostrarEstado();
  }
}

// Clase Mascota - representa una mascota virtual
class Mascota {
  // Atributos privados (encapsulación)
  private String nombre;
  private String tipo;
  private int energia; // 0-100
  private int felicidad; // 0-100

  // Constructor - se ejecuta al crear un nuevo objeto
  public Mascota(String nombre, String tipo, int energia, int felicidad) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.energia = energia;
    this.felicidad = felicidad;
  }

  // Getters - permiten leer atributos privados
  public String getNombre() {
    return nombre;
  }

  public String getTipo() {
    return tipo;
  }

  public int getEnergia() {
    return energia;
  }

  public int getFelicidad() {
    return felicidad;
  }

  // Setters - permiten modificar atributos privados
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Método para alimentar la mascota
  public void alimentar() {
    energia += 20;
    if (energia > 100) {
      energia = 100; // No puede superar 100
    }
    System.out.println(nombre + " ha comido. ¡Ñam ñam!");
  }

  // Método para jugar con la mascota
  public void jugar() {
    if (energia < 10) {
      System.out.println(nombre + " está muy cansado para jugar.");
      return;
    }

    felicidad += 15;
    energia -= 10;

    if (felicidad > 100) {
      felicidad = 100;
    }

    System.out.println(nombre + " está jugando. ¡Qué divertido!");
  }

  // Método para que la mascota duerma
  public void dormir() {
    energia += 30;
    if (energia > 100) {
      energia = 100;
    }
    System.out.println(nombre + " ha dormido. Zzz...");
  }

  // Método para mostrar el estado actual
  public void mostrarEstado() {
    System.out.println("┌─────────────────────────────┐");
    System.out.println("│ Mascota: " + nombre + " (" + tipo + ")");
    System.out.println("│ Energía: " + energia + "/100");
    System.out.println("│ Felicidad: " + felicidad + "/100");

    // Mostramos el estado emocional
    String estado;
    if (felicidad >= 80) {
      estado = "😄 ¡Muy feliz!";
    } else if (felicidad >= 50) {
      estado = "😊 Contento";
    } else if (felicidad >= 30) {
      estado = "😐 Normal";
    } else {
      estado = "😢 Triste";
    }
    System.out.println("│ Estado: " + estado);
    System.out.println("└─────────────────────────────┘");
  }
}
