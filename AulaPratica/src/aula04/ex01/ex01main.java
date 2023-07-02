package aula04.ex01;

import java.util.*;


public class ex01main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        ArrayList<circulo> Circulo = new ArrayList<circulo>();
		ArrayList<retangulo> Retangulo = new ArrayList<retangulo>();
		ArrayList<triangulo> Triangulo = new ArrayList<triangulo>();

        


        do{
            System.out.println("Operações de Formas geométricas");
            System.out.println("1 - Criar Círculo");
            System.out.println("2 - Criar Retângulo");
            System.out.println("3 - Criar Triângulo");
            System.out.println("4 - Listar Círculos");
            System.out.println("5 - Listar Retângulos");
            System.out.println("6 - Listar Triângulos");
            System.out.println("7 - alterar raio do círculo");
            System.out.println("8 - alterar comprimento do retângulo");
            System.out.println("9 - alterar largura do retângulo");
            System.out.println("10 - alterar base do triângulo");
            System.out.println("11 - alterar altura do triângulo");
            System.out.println("12 - mostrar área do círculo"); 
            System.out.println("13 - mostrar área do retângulo");
            System.out.println("14 - mostrar área do triângulo");
            System.out.println("15 - mostrar perímetro do círculo");
            System.out.println("16 - mostrar perímetro do retângulo");
            System.out.println("17 - mostrar perímetro do triângulo");
            System.out.println("18 - sair");

            System.out.println("Escolha uma opção: ");
            input = sc.nextInt();

            switch (input){
                case 0:
                    break;
                
                case 1:
                    System.out.println("Criar Círculo");
                    System.out.println("Insira o raio do círculo: ");
                    double raio = sc.nextDouble();
                    Circulo.add(new circulo(raio));
                    break;

                case 2:
                    System.out.println("Criar Retângulo");
                    System.out.println("Insira o comprimento do retângulo: ");
                    double comprimento = sc.nextDouble();
                    System.out.println("Insira a largura do retângulo: ");
                    double largura = sc.nextDouble();
                    Retangulo.add(new retangulo(comprimento, largura));
                    break;

                case 3:
                    System.out.println("Criar Triângulo");
                    System.out.println("Insira a base do triângulo: ");
                    double base = sc.nextDouble();
                    System.out.println("Insira a altura do triângulo: ");
                    double altura = sc.nextDouble();
                    Triangulo.add(new triangulo(base, altura));
                    break;

                case 4:
                    System.out.println("Listar Círculos");
                    for (circulo circulo : Circulo) {
                        System.out.println(circulo);
                    }
                    break;

                case 5:
                    System.out.println("Listar Retângulos");
                    for (retangulo retangulo : Retangulo) {
                        System.out.println(retangulo);
                    }
                    break;
                
                case 6:
                    System.out.println("Listar Triângulos");
                    for (triangulo triangulo : Triangulo) {
                        System.out.println(triangulo);
                    }
                    break;

                case 7:
                    System.out.println("Alterar raio do círculo");
                    System.out.println("Insira o índice do círculo: ");
                    int indice = sc.nextInt();
                    System.out.println("Insira o novo raio do círculo: ");
                    double novoRaio = sc.nextDouble();
                    Circulo.get(indice).setRaio(novoRaio);
                    break;

                case 8:
                    System.out.println("Alterar comprimento do retângulo");
                    System.out.println("Insira o índice do retângulo: ");
                    int indiceRetangulo = sc.nextInt();
                    System.out.println("Insira o novo comprimento do retângulo: ");
                    double novoComprimento = sc.nextDouble();
                    Retangulo.get(indiceRetangulo).setComprimento(novoComprimento);
                    break;

                case 9: 
                    System.out.println("Alterar largura do retângulo");
                    System.out.println("Insira o índice do retângulo: ");
                    int indiceRetangulo2 = sc.nextInt();
                    System.out.println("Insira a nova largura do retângulo: ");
                    double novaLargura = sc.nextDouble();
                    Retangulo.get(indiceRetangulo2).setLargura(novaLargura);
                    break;

                case 10:
                    System.out.println("Alterar base do triângulo");
                    System.out.println("Insira o índice do triângulo: ");
                    int indiceTriangulo = sc.nextInt();
                    System.out.println("Insira a nova base do triângulo: ");
                    double novaBase = sc.nextDouble();
                    Triangulo.get(indiceTriangulo).setBase(novaBase);
                    break;

                case 11:
                    System.out.println("Alterar altura do triângulo");
                    System.out.println("Insira o índice do triângulo: ");
                    int indiceTriangulo2 = sc.nextInt();
                    System.out.println("Insira a nova altura do triângulo: ");
                    double novaAltura = sc.nextDouble();
                    Triangulo.get(indiceTriangulo2).setAltura(novaAltura);
                    break;

                case 12:
                    System.out.println("Mostrar área do círculo");
                    System.out.println("Insira o índice do círculo: ");
                    int indiceCirculo = sc.nextInt();
                    System.out.println("A área do círculo é: " + Circulo.get(indiceCirculo).getArea());
                    break;

                case 13:
                    System.out.println("Mostrar área do retângulo");
                    System.out.println("Insira o índice do retângulo: ");
                    int indiceRetangulo3 = sc.nextInt();
                    System.out.println("A área do retângulo é: " + Retangulo.get(indiceRetangulo3).getArea());
                    break;
                
                case 14:
                    System.out.println("Mostrar área do triângulo");
                    System.out.println("Insira o índice do triângulo: ");
                    int indiceTriangulo3 = sc.nextInt();
                    System.out.println("A área do triângulo é: " + Triangulo.get(indiceTriangulo3).getArea());
                    break;

                case 15:
                    System.out.println("Mostrar perímetro do círculo");
                    System.out.println("Insira o índice do círculo: ");
                    int indiceCirculo2 = sc.nextInt();
                    System.out.println("O perímetro do círculo é: " + Circulo.get(indiceCirculo2).getPerimetro());
                    break;

                case 16:
                    System.out.println("Mostrar perímetro do retângulo");
                    System.out.println("Insira o índice do retângulo: ");
                    int indiceRetangulo4 = sc.nextInt();
                    System.out.println("O perímetro do retângulo é: " + Retangulo.get(indiceRetangulo4).getPerimetro());
                    break;
                
                case 17:
                    System.out.println("Mostrar perímetro do triângulo");
                    System.out.println("Insira o índice do triângulo: ");
                    int indiceTriangulo4 = sc.nextInt();
                    System.out.println("O perímetro do triângulo é: " + Triangulo.get(indiceTriangulo4).getPerimetro());
                    break;

                case 18:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (input != 18);
        sc.close();
    }
}

