class Jugador {
    // Atributos
    private String nombre;
    private String posicion;
    private int edad;
    private int numeroCamiseta;
    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }
    //mostrar la información del jugador
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numeroCamiseta);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        // datos quemados
        Jugador jugador1 = new Jugador("Lionel Messi", "Delantero", 36, 10);
        Jugador jugador2 = new Jugador("Sergio Ramos", "Defensa", 38, 4);
        Jugador jugador3 = new Jugador("Kylian Mbappé", "Delantero", 24, 7);
        // Mostrar la información de los jugadores
        System.out.println("Información de los jugadores:");
        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();
    }
}
