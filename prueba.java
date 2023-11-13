import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1- Pedir un número al usuario y mostrar los 20 números siguientes al dado.");
            System.out.println("2- Pedir un número y si es mayor de 100, mostrar los 10 números siguientes al dado de dos en dos. Si es menor o igual a 100, mostrar los diez primeros números desde el 0 en adelante.");
            System.out.println("3- Salir");
            System.out.print("Selecciona una opción (1, 2, o 3): ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    int numero = scanner.nextInt();
                    for (int i = numero + 1; i <= numero + 20; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
//este es un comentario de prueba
                case 2:
                    System.out.print("Ingresa un número: ");
                    int num = scanner.nextInt();
                    if (num > 100) {
                        for (int i = num; i <= num + 20; i += 2) {
                            System.out.print(i + " ");
                        }
                    } else {
                        for (int i = 0; i <= 10; i++) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona 1, 2, o 3.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}
