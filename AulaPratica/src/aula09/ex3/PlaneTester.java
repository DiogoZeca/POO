package aula09.ex3;
import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner scanner) {
        String ind, fab, mod;
        int ano, num_max, vel_max, num_trip, num_mun, op;
        System.out.println("Introduza o identificador");
        ind = scanner.next();
        System.out.println("Introduza o fabricante");
        fab = scanner.next();
        System.out.println("Introduza o modelo");
        mod = scanner.next();
        System.out.println("Introduza o ano");
        ano = scanner.nextInt();
        System.out.println("Introduza o número máximo de passageiros");
        num_max = scanner.nextInt();
        System.out.println("Introduza a velocidade máxima");
        vel_max = scanner.nextInt();
        System.out.println("Tipo de avião: comercial (0), militar (1)");
        op = scanner.nextInt();
        switch(op){
            case 0:
                System.out.println("Introduza o número de tripulantes");
                num_trip = scanner.nextInt();
                planeManager.addPlane(new CommercialPlane(ind, fab, mod, ano, num_max, vel_max, num_trip));
            case 1:
                System.out.println("Introduza o número de munições");
                num_mun = scanner.nextInt();
                planeManager.addPlane(new MilitaryPlane(ind, fab, mod, ano, num_max, vel_max, num_mun));
            }

    }

    private static void removePlane(PlaneManager planeManager, Scanner scanner) {
        String id;
        System.out.println("Introduza o identificador do avião para remover");
        id = scanner.nextLine();
        planeManager.removePlane(id);
    }

    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {
        String id;
        System.out.println("Introduza o identificador do avião para pesquisar");
        id = scanner.nextLine();
        planeManager.searchPlane(id);
    }

    private static void printAllPlanes(PlaneManager planeManager) {
        planeManager.printAllPlanes();
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        planeManager.getCommercialPlanes();
    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        planeManager.getMilitaryPlane();
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        planeManager.getFastestPLane();
    }
}
