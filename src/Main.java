import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);
    private static Mascota[] arregloMascotas = new Mascota[30];
    private static int nextPosicion = 0;
    private static Citas[] arregloCitas = new Citas[30];
    private static Reservaciones[] arregloReservaciones = new Reservaciones[30];
    private static Usuarios[] arregloUsuarios = new Usuarios[30];

    public static void main(String[] args) throws IOException {
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = input.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 6);
    }

    public static void mostrarMenu() {
        output.println("Bienvenido al sistema Veterinaria MOKA");
        output.println("1. Registrar Mascota ");
        output.println("2. Ingresar Cita ");
        output.println("3. Reservaciones ");
        output.println("4. Registrar Usuario");
        output.println("5. Listar Datos");
        output.println("6. Salir");
    }
    public static void procesarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                output.println(" Usted ha elegido opcion 1: Registrar mascota ");
                output.println(" Nombre de la mascota");
                String nombreMascota = input.next();
                output.println(" Foto de la mascota ");
                String foto = input.next();
                output.println(" Ranking de la mascota del 1 al 5 ");
                int ranking = input.nextInt();
                output.println(" Datos del dueño");
                output.println(" Nombre ");
                String nombreDueno = input.next();
                output.println(" Primer apellido ");
                String apellidoDueno1 = input.next();
                output.println(" Segundo apellido ");
                String apellidoDueno2 = input.next();
                output.println(" Cedula ");
                String cedula = input.next();
                output.println(" Telefono ");
                String telefono = input.next();
                output.println(" Direccion: Canton ");
                String canton = input.next();
                output.println(" Direccion: Ciudad ");
                String ciudad = input.next();
                output.println(" Direccion: Provincia ");
                String provincia = input.next();
                output.println(" Observaciones ");
                String observacionesMasc = input.next();
                output.println("*************");
                Mascota nueva = new Mascota(nombreMascota, foto, ranking, nombreDueno,
                        apellidoDueno1, apellidoDueno2, cedula, telefono, canton, ciudad, provincia, observacionesMasc);
                arregloMascotas[nextPosicion++] = nueva;
                break;
            case 2:
                output.println(" Usted ha elegido opcion 2: Ingresar cita ");
                output.println(" Nombre de la mascota");
                String nombreMasco = input.next();
                output.println("Fecha de la cita: DDMMYYYY");
                int fechaCita = input.nextInt();
                output.println(" Hora de la cita");
                int horaCita = input.nextInt();
                output.println(" Observaciones ");
                String observacionesCita = input.next();
                Citas nuevas = new Citas(nombreMasco, fechaCita, horaCita, observacionesCita);
                arregloCitas[nextPosicion++] = nuevas;
                output.println("*************");
                break;
            case 3:
                output.println(" Usted ha elegido opcion 3: Reservaciones ");
                output.println(" Nombre de la Mascota");
                String petName = input.next();
                output.println(" Hora de ingreso");
                int horaEntrada = input.nextInt();
                output.println(" Hora de Salida");
                int horasalida = input.nextInt();
                Reservaciones nuevaRe = new Reservaciones(petName, horaEntrada, horasalida);
                arregloReservaciones[nextPosicion++] = nuevaRe;
                output.println("*************");
                break;
            case 4:
                output.println(" Usted ha elegido opcion 4: Registrar usuarios ");
                output.println(" Nombre del Usuario");
                String nombreUsuario = input.next();
                output.println(" Primer Apellido");
                String apellidoUsuario1 = input.next();
                output.println(" Segundo Apellido");
                String apellidoUsuario2 = input.next();
                output.println("Cedula");
                int cedulaUsuario = input.nextInt();
                output.println("Rol: Doctor/Secretaria");
                String rol = input.next();
                output.println("Estado: Activo/Inactivo");
                String estado = input.next();
                Usuarios nuevoUser = new Usuarios(nombreUsuario, apellidoUsuario1, apellidoUsuario2, cedulaUsuario, rol, estado);
                arregloUsuarios[nextPosicion++] = nuevoUser;
                break;
            case 5:
                output.println(" Usted ha elegido opcion 5: Listar datos ");
                output.println(" Elija una opcion:" + "\n" + " 1: Listar Mascotas " + "\n" + " 2: Listar Usuarios " + "\n" + "3: Listar Reservaciones "
                        + "\n" + "4: Listar Citas");
                int selecion = input.nextInt();
                if (selecion == 1) {
                    for (int i = 0; i < arregloMascotas.length; i++) {
                        output.println(" # " + (i + 1) + " " + arregloMascotas[i]);
                    }
                }
                if (selecion == 2) {
                    for (int i = 0; i < arregloUsuarios.length; i++) {
                        output.println(" # " + (i + 1) + " " + arregloUsuarios[i]);

                    }
                }
                if (selecion == 3) {
                    for (int i = 0; i < arregloReservaciones.length; i++) {
                        output.println(" # " + (i + 1) + " " + arregloReservaciones[i]);
                    }
                }
                if (selecion == 4) {
                    for (int i = 0; i < arregloCitas.length; i++) {
                        output.println(" # " + (i + 1) + " " + arregloCitas[i]);
                    }
                }
                break;
            case 6:
                output.println(" Gracias ");
                break;
            default:
                output.println("Opcion invalida ");
        }
    }
}
