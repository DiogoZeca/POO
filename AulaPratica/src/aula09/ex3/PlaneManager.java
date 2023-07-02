package aula09.ex3;

import java.util.ArrayList;

public class PlaneManager {
    ArrayList<Plane> planes = new ArrayList<Plane>();

    public void addPlane(Plane plane){
        planes.add(plane);
    }

    public void removePlane(String id){
        for(int i = 0; i < planes.size(); i++){
            if(planes.get(i).getInd() == id){
                planes.remove(i);
                break;
            }
        }
    }

    public void searchPlane(String id){
        for(int i = 0; i < planes.size(); i++){
            if(planes.get(i).getInd() == id){
                System.out.print(planes.get(i).toString());
            }
        }
    }

    public void printAllPlanes(){
        for(int i = 0; i <planes.size(); i++){
            System.out.println(planes.get(i));
        }
    }

    public void getCommercialPlanes(){
        for(int i = 0; i <planes.size(); i++){
            if(planes.get(i) instanceof CommercialPlane){
                System.out.println(planes.get(i));
            }
        }
    }

    public void getMilitaryPlane(){
        for(int i = 0; i <planes.size(); i++){
            if(planes.get(i) instanceof MilitaryPlane){
                System.out.println(planes.get(i));
            }
        }
    }

    public void getFastestPLane(){
        int temp = 0;
        for(int i = 0; i < planes.size(); i++){
            if(planes.get(i).getVel_max() > temp){
                temp = planes.get(i).getVel_max();
            }else{
                continue;
            }
        }
        System.out.println("A velocidade máxima de todos os aviões é: " + temp);
    }
}