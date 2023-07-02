package aula05.ex1;

import java.util.*;


public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateYMD date = null;
        int day, month, year;
        int option;

        do {
            System.out.println("DATE OPERATIONS");
            System.out.println("1 - Create Date");
            System.out.println("2 - Show current Date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");

            System.out.println("Choose an option: ");
            option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Insert day: ");
                    day = sc.nextInt();
                    System.out.println("Insert month: ");
                    month = sc.nextInt();
                    System.out.println("Insert year: ");
                    year = sc.nextInt();

                    date = new DateYMD(day, month, year);

                    System.out.println("Date created!" + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
                    break;
                
                case 2:
                    if (date == null) {
                        System.out.println("Date not created!");
                    } else {
                        System.out.println("Current date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
                    }
                    break;

                case 3:
                    if (date == null) {
                        System.out.println("Date not created!");
                    } else {
                        date.increment();
                        System.out.println("Date incremented: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
                    }
                    break;

                case 4:
                    if(date == null){
                        System.out.println("Date not created!");
                    } else {
                        date.decrement();
                        System.out.println("Date decremented: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;
            }
        }while(option != 0);
    sc.close();
    }
}
