package aula06.ex2;

import java.util.Scanner;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        Contacto contacto;  //Ingore this
        ArrayList<Contacto> listadecontactos = new ArrayList<Contacto>();

        do{
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opçao: ");
            input = sc.nextInt();

            switch(input){
                case 1:
                    System.out.println("Introduza o ID: ");
                    int ID = sc.nextInt();
                    System.out.println("Introduza o nome: ");
                    String name = sc.nextLine();
                    sc.next();

                    int number = 0;
                    String email = null;

                    System.out.println("Queres introduzir um número? (S/n) ");
                    String resposta = sc.nextLine();
                    sc.next();
                    if(!resposta.trim().toLowerCase().equals("n")){
                        System.out.println("Introduza o número: ");
                        number = sc.nextInt();
                    }

                    System.out.println("Queres introduzir um email? (S/n) ");
                    resposta = sc.nextLine();
                    sc.next();
                    if(!resposta.trim().toLowerCase().equals("n")){
                        System.out.println("Introduza o email: ");
                        email = sc.nextLine();
                        sc.next();
                    }

                    if (number == 0){
                        contacto = new Contacto(name, ID, email);
                    }
                    else if (email == null){
                        contacto = new Contacto(name, number, ID);
                    }
                    else{
                        contacto = new Contacto(name, number, ID, email);
                    }
                    listadecontactos.add(contacto);

                    break;

                case 2:
                    System.out.println("Introduza o ID do contacto a alterar: ");
                    int ID2 = sc.nextInt();
                    for(int i = 0; i < listadecontactos.size(); i++){
                        if(listadecontactos.get(i).getID() == ID2){
                            System.out.println("Introduza o novo nome: ");
                            String name2 = sc.nextLine();
                            sc.next();
                            listadecontactos.get(i).setNome(name2);
                            System.out.println("Introduza o novo número: ");
                            int number2 = sc.nextInt();
                            listadecontactos.get(i).setNumero(number2);
                            System.out.println("Introduza o novo ID: ");
                            int ID3 = sc.nextInt();
                            sc.next();
                            listadecontactos.get(i).setID(ID3);
                            System.out.println("Contacto Alterado: " + listadecontactos.get(i).toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Introduza o ID do contacto a apagar: ");
                    int ID4 = sc.nextInt();
                    for(int i = 0; i < listadecontactos.size(); i++){
                        if(listadecontactos.get(i).getID() == ID4){
                            listadecontactos.remove(i);
                            System.out.println("Contacto apagado");
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("Introduza o ID do contacto a procurar: ");
                    int ID5 = sc.nextInt();
                    for(int i = 0; i < listadecontactos.size(); i++){
                        if(listadecontactos.get(i).getID() == ID5){
                            System.out.println("Contacto encontrado: " + listadecontactos.get(i).toString());
                        }
                    }
                    break;
                
                case 5:
                    for(int i = 0; i < listadecontactos.size(); i++){
                        System.out.println(listadecontactos.get(i).toString());
                    }
                    break;
                
                case 0: 
                    System.out.println("A sair...");
                    break;
                
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(input != 0);
        sc.close();
    }
}
