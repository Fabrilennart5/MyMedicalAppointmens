package view.tui;
import java.util.Scanner;

public class TuiMenu {
    // metodo que muestra el menu
    public static void ShowMenu() {
        Scanner response = new Scanner(System.in);
        int opcion;  // declaramos la variable antes del bucle
        do {
            System.out.println("Por favor elija una opcion: ");
            System.out.println("1. Crear un paciente");
            System.out.println("2. Ver paciente");
            System.out.println("3. Editar registro paciente");
            System.out.println("4. Eliminar registro paciente");
            System.out.println("5. Salir");
            opcion = response.nextInt();
        } while (opcion != 5);

        // cerramos el scanner al final
        response.close();
    }
}
