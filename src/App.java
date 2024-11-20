import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
        //Descripcion del planeta

        // Una vez seleccionado el planeta, el sistema debe mostrar información básica, como la distancia en millones de kilómetros y una breve descripción. 
    
    
        // 2. Gestión de la Nave Espacial 
        // o Seleccionar una nave para el viaje: El sistema ofrecerá al usuario una lista 
        // de naves espaciales, cada una con características básicas, como la velocidad 
        // máxima y la capacidad de pasajeros.
        
        // Ingresar la cantidad de pasajeros: El usuario deberá especificar la cantidad 
        // de pasajeros que viajarán. El sistema solo verificará que se ingrese un valor 
        // positivo, pero no limitará la cantidad máxima.
        //  Cálculo de la duración del viaje: Basado en la velocidad de la nave y la 
        // distancia al planeta

        // 1. Scanner (obvio)
        // 2. Int option (para el menú)
        // 3. Boolean error (para el manejo de errores)
        // 4. String errorMessage (para el mensaje de error)


        // 4. Interacción con el Usuario 
        // o Menú de opciones: El sistema debe proporcionar un menú interactivo en 
        // consola que permita al usuario elegir entre las siguientes opciones: 
        // Seleccionar un planeta de destino.
        //  Seleccionar una nave espacial.
        //  Iniciar la simulación del viaje. 
        // Salir del programa. 
        var scanner = new Scanner(System.in);
        showMenu(scanner);
        scanner.close();
    
   
        // Ingresar el planeta de destino
  


        // Ingresar el numero de pasajeros 
        System.out.println("Por favor ingrese el destino del viaje: ");
//        var pasajeros = scanner.nextLine();
      
      //  System.out.println(destino);
    }
      private static void showMenu(Scanner scanner) {
        int option;
        do {
            System.out.println("================================================= ");
            System.out.println("                  Viaje Espacial                  ");
            System.out.println("------------------------------------------------- ");
            System.out.print(  "A que destino desea realizar el viaje: ");
            System.out.println("Opciones Mercurio, Venus, Marte, Júpiter, Saturno");

            System.out.println("1. Mercurio ");
            System.out.println("2. Venus");
            System.out.println("3. Marte ");
            System.out.println("4. Jupiter");
            System.out.println("5. Saturno ");
            System.out.println("0. Salir de la aplicación ");
            System.out.println("Ingrese el numero correspondiente al planeta de destino: ");
            
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar Buffer - Gastar el <Enter>
            switch (option) {
                case 1:
                    System.out.println("El planeta seleccionado es: Mercurio" );
                    NumberPassengers();
                    break;
                case 2:
                    System.out.println("El planeta seleccionado es: Venus" );
                    NumberPassengers();
                    break;
                case 3:
                    System.out.println("El planeta seleccionado es: Marte" );
                    NumberPassengers();
                    break;
                case 4:
                    System.out.println("El planeta seleccionado es: Jupiter" );
                    NumberPassengers();
                    break;
                case 5:
                    System.out.println("El planeta seleccionado es: Saturno" );
                    NumberPassengers();
                    break;        
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.err.println("Ingrese una opción valida");
                    break;
            }
            if (option != 0) {
                pressEnter(scanner);    
            }
            
        } while (option != 0);
    }
    private static void pressEnter(Scanner scanner){
      System.out.println("Presione ENTER para continuar %n");
      scanner.nextLine();
}
private static void NumberPassengers() {

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
}

 
        
      

    

