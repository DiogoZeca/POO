package aula11.ex02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;



public class Gradebook {
    Map<String, List<Double>> students = new HashMap<>();
    public void load(String fileName) throws FileNotFoundException {
        String aluno;
        Scanner sc = new Scanner( new FileReader(fileName) );
        while(sc.hasNext()){
            List<Double> grades = new ArrayList<>();
            aluno = sc.nextLine();
            String[] notas = aluno.split("\\|");
            grades.add(Double.parseDouble(notas[1]));
            grades.add(Double.parseDouble(notas[2]));
            grades.add(Double.parseDouble(notas[3]));
            students.put(notas[0],grades);
        }
        sc.close();
        //LERE FICHEIRO
    }

    public void addStudent(Student NewStudent){
        students.put(NewStudent.getName(), NewStudent.getGrades());
    }

    public void removeStudent(String RemoveStudent){
        if(students.containsKey(RemoveStudent)){
            students.remove(RemoveStudent);
        }
        else{
            System.out.println("Estudante não listado");
        }
    }

    public Student getStudent(String String){
        if(students.get(String) != null){
            return new Student(String, students.get(String));
        }
        //Devolve o Estudante que contem o nome e as notas
        return null;
    }

    public double calculateAverageGrade(String string){
        double media = 0;
        for (double nota : students.get(string)) {
            media += nota;
        }
        return media / 3;
        //Devolve a media das notas do estudante
    }

    public void printAllStudents(){
        for (String aluno : students.keySet()) {
            System.out.printf("\n O/A aluno(a) " + aluno + "obteve as seguintes classificações: " + students.get(aluno));
        }
        //Imprime todos os estudantes
    }

    @Override
    public String toString() {
        return "Gradebook{" + "students=" + students + '}';
    }
    
}
