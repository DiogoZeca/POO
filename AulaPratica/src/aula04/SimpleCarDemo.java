package aula04;

import java.util.*;

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

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {
        // Exemplo de resultado
        // Carros registados: 
        // Renault Megane Sport Tourer, 2015, kms: 35356
        // Toyota Camry, 2010, kms: 32456
        // Mercedes Vito, 2008, kms: 273891
        String reg = "Carros registados:";
        for (int i = 0; i < cars.length; i++) {
            reg += cars[i].getMake() + " " + cars[i].getModel() + ", " + cars[i].getYear() + ", kms: " + cars[i].getKms() + "";
        }
        System.out.println(reg);
    }

    public static void main(String[] args) {

        Car[] cars = new Car[3]; 
        cars[0] = new Car("Renault","Clio",2002,70000); 
        cars[1] = new Car("Mercedes", "AMG", 2023, 1);
        cars[2] = new Car("Mclaren","Senna",2022, 20000); 

        listCars(cars);

        // Adicionar 10 viagens geradas aleatoriamente
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros
            int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms
            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
            
            cars[j].drive(kms);
            
        }

        listCars(cars);
        sc.close();

    }
}
