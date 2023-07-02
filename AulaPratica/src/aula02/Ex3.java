package aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double agua = util.getDouble("Introduza a quantidade de água (Kg): ", sc);
        double tempInicial = util.getDouble("Ïntroduza a temperatura inicial (Celsius): ", sc);
        double tempFinal = util.getDouble("Introduza a temperatura final (Celsius): ", sc);
        double energia = agua * (tempFinal - tempInicial) * 4184;
        System.out.println("A quantidade de energia necessária é " + energia + " Joules");
        sc.close();
    }    
}
