import java.io.IOException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String  rutaUsuario = "E:/Programacion ciclo superior/carpeta codigos python/usuarios.txt";
        String  rutaVideojuego = "E:/Programacion ciclo superior/carpeta codigos java/videojuego.txt";
        String  opcion = "";

        while (!opcion.equals("8")) {
            System.out.println("\n////////Venta de Juegos Online/////////\n");
            System.out.println("Elige la opción que desees dependiendo de tu necesidad:");
            System.out.println("1) Buscar un usuario (ingresa el dni)");
            System.out.println("2) Agregar un nuevo usuario a la lista");
            System.out.println("3) Eliminar un usuario de la lista");
            System.out.println("4) Buscar un videjuego");
            System.out.println("5) insertar un nuevo videjuego");
            System.out.println("6) eliminar videojuego");
            System.out.println("7) Salir del menú :(");

            System.out.println("\nElige la opcion que necesites");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el Dni para buscar al usuario correspondiente");
                    String busquedaDni = scanner.nextLine();
                    Usuarios.busquedaDni (rutaUsuario , busquedaDni);
                    break;
                case "2":
                    System.out.println("Ingrese los datos del usuario que Quiere agregar (dni , nombre , apellido):");
                    String usuario = scanner.nextLine();
                    Usuarios.agregarUsuario(rutaUsuario , usuario);
                    System.out.println("usuario agregado correctamente");
                    break;
                case "3":
                    System.out.println("Ingrese el dni del usuario que deseas eliminar:");
                    String borraUsuario = scanner.nextLine();
                    Usuarios.eliminarUsuario(rutaUsuario , borraUsuario);
                    System.out.println("usuario eliminado correctamente");
                    break;
                case "4":
                    System.out.println("ingrese aqui el videojuego que quiere buscar:");
                    String juegoBuscado  = scanner.nextLine();
                    Juegos.busquedaVideojuego(rutaVideojuego ,juegoBuscado);
                    break;
                case "5":
                    System.out.println("ingrese el nuevo Videojuego que quieres agregar:");
                    String juegoInsertado = scanner.nextLine();
                    Juegos.InsertarVideojuego(rutaVideojuego , juegoInsertado);
                    break;
                case "6":
                    System.out.println("ingrese aqui el videojuego que quieres eliminar:");
                    String juegoBorrados = scanner.nextLine();
                    Juegos.borrarVideojuegos(rutaVideojuego , juegoBorrados);
                    break;
                case "7":
                    System.out.println("gracias por usar el menu :)");
                    break;
                default:
                    System.out.println("opcion incorrecta, por favor elige otra");
                    break;
            }
        }
        scanner.close();
    }
}
