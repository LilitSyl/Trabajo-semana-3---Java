import java.util.Scanner; // Importa la clase Scanner para leer entrada del usuario

public class Vehiculo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Declarar variables
        String marca, modelo, tipoCombustible;
        int cilindrada, capacidad;

        // Pedir datos al usuario
        System.out.print("Ingrese la marca del vehículo: ");
        marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del vehículo: ");
        modelo = scanner.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        cilindrada = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.print("Ingrese el tipo de combustible: ");
        tipoCombustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros: ");
        capacidad = scanner.nextInt();

        // Mostrar los datos ingresados
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        scanner.close(); // Cerrar el scanner
    }
}