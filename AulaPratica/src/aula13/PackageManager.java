package aula13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class PackageManager {
    private static List<Package> packages = new ArrayList<>();

    public static void addPackage(Package pkg) {
        packages.add(pkg);
    }

    public static void removePackage(int id) {
        Package pkg = searchPackage(id);
        if (pkg != null) {
            packages.remove(pkg);
        } else {
            System.out.println("Package not found.");
        }
    }

    public static Package searchPackage(int id) {
        for (Package pkg : packages) {
            if (pkg.getIdm() == id) {
                return pkg;
            }
        }
        return null;
    }

    public static double calculateShippingCost(int id) {
        Package pkg = searchPackage(id);
        if (pkg != null) {
            double weight = pkg.getWeight();
            double costPerKg = 0.5; // example value
            return weight * costPerKg;
        } else {
            System.out.println("Package not found.");
            return 0;
        }
    }

    public static void createNewFile() throws FileNotFoundException {
        File file = new File("packages.txt");
        PrintWriter writer = new PrintWriter(file);
        for (Package pkg : packages) {
            writer.println(pkg);
        }
        writer.close();
    }

    public static void printAllPackages() {
        for (Package pkg : packages) {
            System.out.println(pkg);
        }
    }
}
