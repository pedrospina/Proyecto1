import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
        var scanner = new Scanner(System.in);
        showMenu(scanner);
        scanner.close();
        boolean error = false ;
        String errorMsg;
        String planets = "3";
        float planetDistance; //3
        String planetDescription = "3";
        int destinationPlanet;
        String spaceShips = "3";
        float spaceShipsMaxVel;
        int spaceShipsMaxCapacity;
        int spaceShipsCapacity;
        float travelDuration;
        int travelProgress;

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
        // Ingresar el planeta de destino
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

private static void menuDestinationPlanet(){


}

  private static void menuSpaceshipManagement()  {


  }

  private static void calTravelDuration(float scanner){
    

  }

  private static void calTravelProgress(float scanner){
    

  }
}

 
        
      

    

