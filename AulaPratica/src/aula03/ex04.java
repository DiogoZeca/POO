package aula03;

import java.util.Scanner;
import java.lang.Math;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumAlunos = util.getInt("Insira o número de alunos: ", sc);

        //armazenar notas em vetor
        Double[][] notas = new Double[NumAlunos][3];
        System.out.printf("%6s %6s %6s\n", "NotaT", "NotaP", "Pauta");


        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                double notaT, notaP, notaF;

                notaT = Math.round(RandomNumber(20.0));
                notaP = Math.round(RandomNumber(20.0));
                if(notaT <= 7 || notaP <= 7){
                    notaF = 66;
                }else{
                    notaF = Math.round(0.4 * notaT + 0.6 * notaP);
                }

                notas[i][0] = notaT;
                notas[i][1] = notaP;
                notas[i][2] = notaF;


                System.out.printf("%6s %6s %6s\n", notaT , notaP, notaF);
            }
        }    
    }




            //RANDOM NOTAS
    public static Double RandomNumber(Double n) {
        Double random = (Double) (Math.random() * n);
        return random;
    }
}
