package aula03;
import java.util.Scanner;


public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = util.getString("Pretende jogar? Prima (S)im ", sc).toLowerCase();
        if (resposta.equals("s") || resposta.equals("sim")) {
            Jogo(sc);
        }else{
            System.out.println("Obrigado por jogar!");
        }
    }

    public static void Jogo(Scanner sc) {
        int numero = util.getInt("Introduza um número entre 1 e 100: ", sc);
        int random = RandomNumber(100);
        int tentativas = 0;
        while (numero != random) {
            if (numero > random) {
                System.out.println("O número é menor!");
            } else {
                System.out.println("O número é maior!");
            }
            numero = util.getInt("Introduza um número entre 1 e 100: ", sc);
            tentativas++;
        }
        System.out.println("Parabéns, acertou! O número era " + random + " e tentou " + tentativas + " vezes.");

    }

    public static int RandomNumber(int n) {
        int random = (int) (Math.random() * n);
        return random;
    }
}
