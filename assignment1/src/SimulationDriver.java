import entity.Choice;
import entity.MultipleChoiceQuestion;
import entity.SingleChoiceQuestion;
import entity.Student;
import interfaces.*;

import java.util.*;

public class SimulationDriver {

    public static void main(String[] args) {

        VotingService qi = new VotingService();
        StudentInterface si = new StudentInterfaceImpl();

        int n = 50;
        List<Student> student = si.generateStudents(n);     // Assign 50 student to vote question

        System.out.println("Enter 1 for single question, enter 2 for multiple question: ");
        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();


        if (select == 1) {
            System.out.println("Total have "+ n +" students to answer these question.");
            List<SingleChoiceQuestion> singlequestion = qi.generateSingleQuestions();
            for (int i = 0; i < singlequestion.size(); i++) {
                SingleChoiceQuestion s = singlequestion.get(i);
                System.out.println("Problem: "+(i + 1) + ". " + s.getProblem());

                List<Choice> c = s.getListChoices();
                for (int j = 0; j < c.size(); j++) {
                    Choice op = c.get(j);
                    System.out.print(op.getOption() + ". " + op.getOption_value());
                    //blank line
                    System.out.println();
                }

                Map<Character, Integer> singleMap = qi.answerSingleQuestion(s, student);
                System.out.println(Arrays.asList(singleMap));
                System.out.println();
            }

        }

        if (select == 2) {
            System.out.println("Total have "+ n +" students to answer these question.");
            List<MultipleChoiceQuestion> mulquestion = qi.generateMutipleQuestions();
            for (int i = 0; i < mulquestion.size(); i++) {
                MultipleChoiceQuestion m = mulquestion.get(i);
                System.out.println("Problem: "+ (i + 1) + ". " + m.getProblem());

                List<Choice> c = m.getListChoices();
                for (int j = 0; j < c.size(); j++) {
                    Choice op = c.get(j);
                    System.out.print(op.getOption() + ". " + op.getOption_value());
                    //blank line
                    System.out.println();
                }

                Map<Character, Integer> multipleMap = qi.answerMultipleQuestion(m, student);
                System.out.println(Arrays.asList(multipleMap));
                System.out.println();
            }
        }
    }
}
