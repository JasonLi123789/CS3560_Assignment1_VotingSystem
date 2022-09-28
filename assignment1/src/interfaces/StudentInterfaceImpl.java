package interfaces;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentInterfaceImpl implements StudentInterface{
    @Override
    public List<Student> generateStudents(int n) {

        List<Student> s = new ArrayList<>();

        Random r = new Random();
        for(int i=0; i< n; i++){
            s.add(new Student(r.nextInt()+""));
        }
        return s;
    }
}
