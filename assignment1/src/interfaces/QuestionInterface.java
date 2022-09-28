package interfaces;

import entity.MultipleChoiceQuestion;
import entity.SingleChoiceQuestion;
import entity.Student;

import java.util.List;
import java.util.Map;

public interface QuestionInterface {

    public List<SingleChoiceQuestion> generateSingleQuestions();

    public List<MultipleChoiceQuestion> generateMutipleQuestions();

    public Map<Character, Integer> answerSingleQuestion(SingleChoiceQuestion s, List<Student> students);

    public Map<Character, Integer> answerMultipleQuestion(MultipleChoiceQuestion m, List<Student> students);


}
