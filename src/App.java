import java.util.Scanner;

public class App {

    // Colores para la consola
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    // static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    // static final String PURPLE = "\u001B[35m";
    // static final String CYAN = "\u001B[36m";
    static final String WHITE = "\u001B[37m";

    // Variables estaticas para poder usarlas a lo largo del proyecto
    static Scanner input = new Scanner(System.in);
    static int option;
    static boolean error = true;
    static String errorMsg = "";

    public static void main(String[] args) throws Exception {

        // Metodo que crea el menu al pasarle un array de opciones y devuelve el valor
        // seleccionado una vez verificado
        String[] options = { "Select destination planet.", "Select spacecraft.", "Start the travel simulation.",
                "Exit the program." };
        option = showMenu(options);
        System.out.println("La opcion seleccionada es: " + option);

        String planets = "3";
        float planetDistance; // 3
        String planetDescription = "3";
        int destinationPlanet;
        String spaceShips = "3";
        float spaceShipsMaxVel;
        int spaceShipsMaxCapacity;
        int spaceShipsCapacity;
        float travelDuration;
        int travelProgress;
    }

    private static int showMenu(String[] options) {
        String optionsTemp;
        int nOptions = options.length;
        int i;
        int selectionTemp;
        int selection = 0;

        while (error == true) {
            optionsTemp = "";
            i = 0;
            selectionTemp = 0;

            System.out.printf("%1$s               _____ ____  ___   ____________\n"
                    + "              / ___// __ \\/   | / ____/ ____/\n"
                    + "              \\__ \\/ /_/ / /| |/ /   / __/\n"
                    + "             ___/ / ____/ ___ / /___/ /___\n"
                    + "%2$s   _____ ___%1$s/____/_/%2$s__ %1$s/_/%2$s__%1$s|_\\____/_____/%2$s_____  ____\n"
                    + "  / ___//  _/  |/  / / / / /   /   |/_  __/ __ \\/ __ \\\n"
                    + "  \\__ \\ / // /|_/ / / / / /   / /| | / / / / / / /_/ /\n"
                    + " ___/ // // /  / / /_/ / /___/ ___ |/ / / /_/ / _, _/\n"
                    + "/____/___/_/  /_/\\____/_____/_/  |_/_/  \\____/_/ |_|%3$s\n\n", RED, GREEN, WHITE);

            for (String option : options) {
                if (i != (nOptions - 1)) {
                    optionsTemp = optionsTemp.concat("%1$s" + (i + 1) + ".%2$s " + option + "\n");
                } else {
                    optionsTemp = optionsTemp.concat("%1$s" + (i - (nOptions - 1)) + ".%2$s "
                            + option + "\n");
                }
                i = i + 1;
            }

            if (error = true) {
                optionsTemp = optionsTemp.concat(errorMsg);
                error = false;
            }

            optionsTemp = optionsTemp.concat("%3$sPlease select an option (0 - " + (nOptions - 1) + "):%2$s ");
            System.out.printf(optionsTemp, GREEN, WHITE, BLUE, RED);

            if (input.hasNextInt()) {
                selectionTemp = input.nextInt();
                if (selectionTemp >= 0 & selectionTemp <= (nOptions - 1)) {
                    selection = selectionTemp;
                } else {
                    error = true;
                    errorMsg = "%4$sError: The option " + selectionTemp + " is not valid.%2$s\n";
                }
            } else {
                error = true;
                errorMsg = "%4$sError: Please enter a number from 0 to " + (nOptions - 1) + ".%2$s\n";
            }
            input.nextLine();
        }
        return selection;
    }

    private static void NumberPassengers() {
        // Ingresar el numero de pasajeros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de pasajeros para el viaje: ");

        var passenger = scanner.nextInt();

        if (passenger < 0) {
            System.out.printf("El numero es negativo por favor ingrese un numero positivo  %n " + passenger);
            return;
        } else {
            if (passenger == 0) {
                System.out.printf("El numero es igual a: " + passenger + "ingrese un numero mayor %n ");
            } else {
                if (passenger > 0) {
                    System.out.printf("El numero de pasajeros es: %n " + passenger);
                } else {

                }
            }
        }
        scanner.close();
    }

    private static void menuDestinationPlanet() {

    }

    private static void menuSpaceshipManagement() {

    }

    private static void calTravelDuration(float scanner) {

    }

    private static void calTravelProgress(float scanner) {

    }
}
