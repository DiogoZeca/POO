package aula02;
import java.util.Scanner;

public class exTP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        int dias = 0;
        switch(mes){
        case 2:
            dias = 28;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            dias = 30;
            break;
        default:
            dias = 31;
            break;
        }
        System.out.println("O mês " + mes + " tem " + dias + " dias");
        sc.close();
    }
}
