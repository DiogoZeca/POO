package aula06.ex3;

public class ex3 {
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        c1.insert(4); c1.insert(7); c1.insert(6); c1.insert(5);

        Conjunto c2 = new Conjunto();
        int[] test = { 7, 3, 2, 5, 4, 6, 7};
        for (int el : test) {
            c2.insert(el); c2.remove(3); c2.remove(5); c2.remove(6);
        }

        System.out.println(c1);     // 4 7 6 5 
        System.out.println(c2);     // 7 2 4

        System.out.println("Número de elementos de c1: " + c1.size());      // 4
        System.out.println("Número de elementos de c2: " + c2.size());      // 3

        System.out.println("c1 contém 6?: " + ((c1.contains(6)) ? "Sim" : "Não"));      // Sim
        System.out.println("c2 contém 6?: " + ((c2.contains(6)) ? "Sim" : "Não"));      // Não

        System.out.println("União: " + c1.unir(c2));     // 4 7 6 5 2
        System.out.println("Interseção: " + c1.interset(c2));        // 7 4
        System.out.println("Diferença: " + c1.subtrair(c2));     // 6 5

        c1.empty();
        System.out.println("c1:" + c1);     //""

    }

}
