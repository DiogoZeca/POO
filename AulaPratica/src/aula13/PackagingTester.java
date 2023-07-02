package aula13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PackagingTester {
   public static void main(String[] args) throws FileNotFoundException {
    PackageManager packageManager = new PackageManager();
    int choice = 0;
    Scanner js = new Scanner(System.in);
    Scanner sc = new Scanner(new FileReader("encomendas.txt"));
    sc.nextLine();
        while(sc.hasNext()){
            String word = sc.nextLine();
            String[] infos = word.split("\\;");
            double weight = Double.valueOf(infos[1]);       // set String[1] for Peso(double)
            String sender = infos[2];                       // set String[2] for remetente(String)
            String destination = infos[3];                  // set String[3] for Destino(String)

            Package pkg = new Package(weight, sender, destination);
            PackageManager.addPackage(pkg);
        }
            
        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Remove a Package");
            System.out.println("2. Search for a Package");
            System.out.println("3. Find the price");
            System.out.println("4. Print summary of all Packages");
            System.out.println("5. Generate a new text file");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = js.nextInt();

            switch (choice) {
                case 1:
                    removePackage(packageManager, js);
                    break;
                case 2:
                    searchPackage(packageManager, js);
                    break;
                case 3:
                    calculateShippingCost(packageManager, js);
                case 4:
                    printAllPackages(packageManager);
                    break;
                case 5:
                    createNewFile(packageManager);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 0);
    }  

    private static void calculateShippingCost(PackageManager packageManager, Scanner js) {
        int id;
        System.out.println("Introduza o identificador do Pacote: ");
        id = js.nextInt();
        PackageManager.calculateShippingCost(id);
    }

    private static void createNewFile(PackageManager packageManager) throws FileNotFoundException {
        PackageManager.createNewFile();
    }

    private static void searchPackage(PackageManager packageManager, Scanner js) {
        int id;
        System.out.println("Introduza o identificador do Pacote: ");
        id = js.nextInt();
        PackageManager.removePackage(id);
    }

    private static void removePackage(PackageManager packageManager, Scanner js) {
        int id;
        System.out.println("Introduza o identificador do pacote para procurar: ");
        id = js.nextInt();
        PackageManager.searchPackage(id);
    }

    private static void printAllPackages(PackageManager packageManager) {
        PackageManager.printAllPackages();
    }
}