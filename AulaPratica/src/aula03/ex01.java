package aula03;

import java.util.Scanner;
import java.lang.Math;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = util.getInt("Introduza um número inteiro: ", sc);
        int sum = 0;

        for (int i = 2; i <= v; i++){
            if (IsPrime(i) == 1){
                sum += i;
            }
        }
        System.out.println("A soma dos números primos entre 2 e " + v + " é " + sum);
    }

    public static int IsPrime(int n){
        int i = 2;
        while (i < Math.sqrt(n)){
            if (n % i == 0){
                return 0;
            }
            i++;
        }
        return 1;
    }
}

