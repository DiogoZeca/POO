package AvAula07;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        ILibrary library = new Library();
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("7")) {
            System.out.println("Library Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Search for item");
            System.out.println("4. Borrow item");
            System.out.println("5. Return item");
            System.out.println("6. Print inventory");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // adicionar um item
                    System.out.print("Enter item type (1 - Book, 2 - DVD): ");
                    int itemType = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter item title: ");
                    String itemTitle = scanner.nextLine();

                    if (itemType == 1) {
                        System.out.print("Enter item author: ");
                        String itemAuthor = scanner.nextLine();

                        Book book = new Book(itemTitle, itemAuthor);
                        library.addItem(book);
                        System.out.println("Book " + itemTitle + " added.");
                    } else if (itemType == 2) {
                        System.out.print("Enter item duration: ");
                        int itemDuration = scanner.nextInt();
                        scanner.nextLine();

                        DVD dvd = new DVD(itemTitle, itemDuration);
                        library.addItem(dvd);
                        System.out.println("DVD " + itemTitle + " added.");
                    } else {
                        System.out.println("Invalid item type.");
                    }
                    
                    break;
                case "2":
                    // remover um item
                    System.out.print("Enter item title: ");
                    String itemTitle1 = scanner.nextLine();

                    LibraryItem item = library.searchForItem(itemTitle1);
                    if (item != null) {
                        library.removeItem(item);
                        System.out.println("Item " + itemTitle1 + " removed.");
                    } else {
                        System.out.println("Item not found.");
                    }

                    break;
                case "3":
                    // procurar um item e imprimir as suas informações
                    System.out.print("Enter item title: ");
                    String itemTitle2 = scanner.nextLine();

                    LibraryItem item1 = library.searchForItem(itemTitle2);
                    if (item1 != null) {
                        System.out.println(item1);
                    } else {
                        System.out.println("Item not found.");
                    }

                    break;
                case "4":
                    // emprestar um item, através do ID
                    System.out.print("Enter item ID: ");
                    int itemId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter borrower name: ");
                    String borrowerName = scanner.nextLine();

                    System.out.print("Enter number of days: ");
                    int numberOfDays = scanner.nextInt();
                    scanner.nextLine();

                    boolean success = library.borrowItem(itemId, borrowerName, numberOfDays);
                    if (success) {
                        System.out.println("Item borrowed.");
                    } else {
                        System.out.println("Item not found.");
                    }

                    break;
                case "5":
                    // devolver um item, através do ID
                    System.out.print("Enter item ID: ");
                    int itemId1 = scanner.nextInt();
                    scanner.nextLine();

                    boolean success1 = library.returnItem(itemId1);
                    if (success1) {
                        System.out.println("Item returned.");
                    } else {
                        System.out.println("Item not found.");
                    }

                    break;
                case "6":
                    // imprimir o inventório da libraria
                    library.printInventory();
                    break;
                case "7":
                    System.out.println("Exiting program.");
                    break;
                default:
                    // imprimir mensagem de erro
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}