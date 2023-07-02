package aula02;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = util.getInt("Insira o tempo em segundos: ", sc);
        int horas = num / 3600;
        int minutos = (num % 3600) / 60;
        int segundos = (num % 3600) % 60;
        System.out.println("O tempo é " + horas + ":" + minutos + ":" + segundos);
        sc.close();
    }
}
