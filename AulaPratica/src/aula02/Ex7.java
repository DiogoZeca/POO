package aula02;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = util.getDouble("Insira coordenadas (x) do ponto P1: ", sc);
        double y1 = util.getDouble("Insira coordenadas (y) do ponto P1: ", sc);
        double x2 = util.getDouble("Insira coordenadas (x) do ponto P2: ", sc);
        double y2 = util.getDouble("Insira coordenadas (y) do ponto P2: ", sc);
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        String distanciaString = String.format("%.2f", distancia);
        System.out.println("A distância entre os pontos P1 e P2 é " + distanciaString);
        sc.close();
    }
}
