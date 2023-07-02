package aula05.ex2;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        int input;
        Calendario calendario = null;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("0 - exit");

            System.out.println("Choose an Operation: ");
            input = sc.nextInt();

            switch(input){
                case 1:
                    System.out.println("Introduce the year: ");
                    int year = sc.nextInt();
                    System.out.println("Introduce the day when the year beggins (1-Sunday, 7-Saturday): ");
                    int weekDay = sc.nextInt();

                    calendario = new Calendario(year, weekDay);
                    System.out.println("Calendar created: " + year);
                    break;

                case 2:
                    if(calendario == null){
                        System.out.println("Calendar does not exist.");
                        break;
                    }

                    System.out.println("Introduce the month: ");
                    int month = sc.nextInt();
                    calendario.printMonth(month);
                    break;

                case 3:
                    if(calendario == null){
                        System.out.println("Calendar does not exist.");
                        break;
                    }

                    calendario.toString();
                    break;

                case 0:
                    break;
            }
            System.out.println();
        } while (input != 0);
    sc.close();
    }
}
