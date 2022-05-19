package oop.labor12.labor12_3;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args){
        BAC bac = new BAC("nevek1.txt");
        TreeSet<String> bukottdiak = new TreeSet<>();
        AtomicInteger ugyesdiak = new AtomicInteger();
        bac.addMark("matek.txt", Subject.Matek);
        bac.addMark("roman.txt", Subject.Roman);
        bac.addMark("magyar.txt", Subject.Magyar);
        bac.getStudents().forEach((key, value) ->{
            if(value.passed()){
                ugyesdiak.incrementAndGet();
            }
            else{
                bukottdiak.add(value.getFirstName() + " " + value.getLastName());
            }
        });
        System.out.println(ugyesdiak);
        /*bukottdiak.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getFirstName().equals(o2.getFirstName())){
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });*/
        for (String o: bukottdiak) {
            System.out.println(o);
        }
    }
}
