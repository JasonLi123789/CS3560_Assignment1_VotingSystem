package entity;

public class Student {
    private String studentID;

    public Student(String studentID) {   //Constructor
        this.studentID = studentID;
    }

    public void setStudentID(String studentID){     //Set function
        this.studentID = studentID;
    }

    public String getStudentID(){           //Get function
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + studentID + '\'' +
                '}';
    }
}
