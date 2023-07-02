package aula04;

import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;
        
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        // registo de carros termina quando o utilizador inserir uma linha vazia 
        // devolve número de carros registados
        int count = 0;
        String reg = "";
        while(true){
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            reg = sc.nextLine();
            if(reg.equals("")){
                break;
            }
            String[] words = reg.split(" ");
            String ultimo=words[words.length - 1];
            String penultimo=words[words.length - 2];
            String primeiro = words[words.length - 3];
            String segundo= words[words.length - 4];

            if(isNumeric(ultimo) && isNumeric(penultimo)){
                int ano = Integer.parseInt(penultimo);
                int kms = Integer.parseInt(ultimo);
                Car car = new Car(segundo, primeiro, ano, kms);
                cars[count] = car;
                count++;
                if(count >= cars.length){
                    break;
                }
            }
            else{
                System.out.println("Dados inválidos");
            }
        }
        return count;      
   }

   private static boolean isNumeric(String s){
    try {
        Integer.parseInt(s);
    } catch (NumberFormatException e) {
        return false;
    }
    return true;
}

    static void registerTrips(Car[] cars, int numCars) {
        // registo de viagens termina quando o utilizador inserir uma linha vazia 
        String viag = "";
        while(true){
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            viag = sc.nextLine();
            if(viag.equals("")){
                break;
            }

            String[] viagem = viag.split(":");
            String carro = viagem[viagem.length - 2];
            String distancia = viagem[viagem.length - 1];
            
            if(Integer.parseInt(distancia) < 0  || !isNumeric(distancia) || !isNumeric(carro)){
                System.out.println("Dados inválidos");
                continue;
            }else{
                cars[Integer.parseInt(carro)].drive(Integer.parseInt(distancia));
                continue;
            }
        } 
    }


    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        // Exemplo de resultado
        // Carros registados:
        // Toyota Camry, 2010, kms: 234346
        // Renault Megane Sport Tourer, 2015, kms: 32536
        for(int i = 0; i < cars.length; i++){
            if(cars[i] != null){
                System.out.println(cars[i].getMake() + " " + cars[i].getModel() + ", " + cars[i].getYear() + ", kms: " + cars[i].getKms());
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}