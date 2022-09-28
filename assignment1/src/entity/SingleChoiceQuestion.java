package entity;

import java.util.List;

public class SingleChoiceQuestion extends Question{

    private List<Choice> listChoices;

    public SingleChoiceQuestion(){}

    public SingleChoiceQuestion(List<Choice> listChoices) {
        this.listChoices = listChoices;
    }

    public SingleChoiceQuestion(int ID, String problem, List<Choice> listChoices) {
        super(ID, problem);
        this.listChoices = listChoices;
    }

    public List<Choice> getListChoices() {
        return listChoices;
    }

    public void setListChoices(List<Choice> listChoices) {
        this.listChoices = listChoices;
    }
}
