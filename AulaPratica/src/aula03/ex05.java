package aula03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o mês e ano no formato MM/AAAA: ");
        String input = sc.nextLine();

        if (!input.contains("/")) {
            System.out.println("Formato inválido");
            sc.close();
            return;
        }

        String[] data = input.split("/");
        int mes = Integer.parseInt(data[0]);
        int ano = Integer.parseInt(data[1]);
        
        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido");
            sc.close();
            return;
        }

        if (ano < 1) {
            System.out.println("Ano inválido");
            sc.close();
            return;
        }
        
        // 1 - Segunda, 2 - Terça, 3 - Quarta, 4 - Quinta, 5 - Sexta, 6 - Sábado, 7 - Domingo
        int diaSemana = util.getInt("Insira o dia da semana do primeiro dia do mês: ", sc);
        
        sc.close();

        if (diaSemana < 1 || diaSemana > 7) {
            System.out.println("Dia da semana inválido");
            return;
        }
        
        imprimirCalendario(diaSemana, mes, ano);
    }

    public static void imprimirCalendario(int diaSemana, int mes, int ano) {
        int dias = diasMes(mes, ano);
        String nomeMes = getNomeMes(mes);

        int espacos = (20 - nomeMes.length() - String.valueOf(ano).length()) / 2;
        String espacosString = "";
        for (int i = 0; i < espacos; i++) {
            espacosString += " ";
        }

        System.out.println(espacosString + nomeMes + " " + ano + espacosString);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int diaSemanaCorreto = diaSemana;
        if (diaSemanaCorreto == 7) diaSemanaCorreto = 0;

        for (int i = 0; i < diaSemanaCorreto; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= dias; i++) {
            System.out.printf("%2d ", i);

            if (diaSemana == 6) {
                System.out.println();
                diaSemana = 0;
            } else {
                diaSemana++;
            }
        }
    }

    // Obter o número de dias de um mês
    public static int diasMes(int mes, int ano) {
        int dia;

        if (mes == 2) {
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                dia = 29;
            } else {
                dia = 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dia = 30;
        } else {
            dia = 31;
        }

        return dia;
    }

    public static String getNomeMes(int mes) {
        String nomeMes;

        switch (mes) {
            case 1:
                nomeMes = "January";
                break;
            case 2:
                nomeMes = "February";
                break;
            case 3:
                nomeMes = "March";
                break;
            case 4:
                nomeMes = "April";
                break;
            case 5:
                nomeMes = "May";
                break;
            case 6:
                nomeMes = "June";
                break;
            case 7:
                nomeMes = "July";
                break;
            case 8:
                nomeMes = "August";
                break;
            case 9:
                nomeMes = "September";
                break;
            case 10:
                nomeMes = "October";
                break;
            case 11:
                nomeMes = "November";
                break;
            case 12:
                nomeMes = "December";
                break;
            default:
                nomeMes = "Invalid month";
                break;
        }

        return nomeMes;
    }
}
