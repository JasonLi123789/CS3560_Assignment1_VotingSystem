package entity;

public class Question {

    private int ID;

    private String problem;

    public Question(){

    }

    public Question(int ID, String problem){
        this.ID = ID;
        this.problem = problem;
    }


    public int getID() {
        return ID;
    }

    public String getProblem() {
        return problem;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
