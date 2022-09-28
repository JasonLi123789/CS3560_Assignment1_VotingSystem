package interfaces;

import entity.Choice;
import entity.MultipleChoiceQuestion;
import entity.SingleChoiceQuestion;
import entity.Student;

import java.util.*;

public class VotingService implements QuestionInterface {

    Random random = new Random();

    /*
     *  Create single questions and choice,
     * then store these in the List
     * */
    @Override
    public List<SingleChoiceQuestion> generateSingleQuestions() {

        List<SingleChoiceQuestion> list = new ArrayList<>();

        List<Choice> listChoice = new ArrayList<>();
        Choice c1 = new Choice('A', "At run time");
        Choice c2 = new Choice('B', "At compile time");
        Choice c3 = new Choice('C', "Depends on the code");
        Choice c4 = new Choice('D', "None");
        listChoice.add(c1);
        listChoice.add(c2);
        listChoice.add(c3);
        listChoice.add(c4);
        SingleChoiceQuestion s = new SingleChoiceQuestion(1, "When is the object created with a new keyword?", listChoice);
        list.add(s);

        List<Choice> listChoice1 = new ArrayList<>();
        Choice c5 = new Choice('A', "Polymorphism");
        Choice c6 = new Choice('B', "Inheritance");
        Choice c7 = new Choice('C', "Encapsulation");
        Choice c8 = new Choice('D', "Abstraction");
        listChoice1.add(c5);
        listChoice1.add(c6);
        listChoice1.add(c7);
        listChoice1.add(c8);
        SingleChoiceQuestion s1 = new SingleChoiceQuestion(2,
                "Under which pillar of OOPS do base class and derived class relationships come?", listChoice1);
        list.add(s1);

        return list;
    }

    /*
     *  Create multiple questions and choice,
     * then store these in the List
     * */
    @Override
    public List<MultipleChoiceQuestion> generateMutipleQuestions() {
        List<MultipleChoiceQuestion> list2 = new ArrayList<>();

        List<Choice> listChoice = new ArrayList<>();
        Choice c1 = new Choice('A', "Friend function");
        Choice c2 = new Choice('B', "Static function");
        Choice c3 = new Choice('C', "Virtual function");
        Choice c4 = new Choice('D', "Const function");
        listChoice.add(c1);
        listChoice.add(c2);
        listChoice.add(c3);
        listChoice.add(c4);
        MultipleChoiceQuestion m = new MultipleChoiceQuestion(2,
                "Choose the option below which is not a member of the class?", listChoice);
        list2.add(m);

        List<Choice> listChoice1 = new ArrayList<>();
        Choice c5 = new Choice('A', "Constructor");
        Choice c6 = new Choice('B', "Destructor");
        Choice c7 = new Choice('C', "Static");
        Choice c8 = new Choice('D', "None");
        listChoice1.add(c5);
        listChoice1.add(c6);
        listChoice1.add(c7);
        listChoice1.add(c8);
        MultipleChoiceQuestion m1 = new MultipleChoiceQuestion(2,
                "Which of the following functions can be inherited from the base class?", listChoice1);
        list2.add(m1);

        return list2;
    }

    @Override
    public Map<Character, Integer> answerSingleQuestion(SingleChoiceQuestion singleChoiceQuestion, List<Student> students) {
        Map<Character, Integer> map = new HashMap<>();

        List<Choice> choiceList = singleChoiceQuestion.getListChoices();
        for (Choice c : choiceList) {
            map.put(c.getOption(), 0);
        }

        for (int j = 0; j < students.size(); j++) {
            Student student = students.get(j);
            int choiceSize = choiceList.size();
            // [0, 4)
            int studentAnswer = random.nextInt(choiceSize);
            // get the chioce the student has answered
            Choice choice = choiceList.get(studentAnswer);
            // if the key is existed
            if (map.containsKey(choice.getOption())) {
                // get the counter
                int count = map.get(choice.getOption());
                // counter + 1
                map.put(choice.getOption(), ++count);
            }

        }

        return map;
    }

    @Override
    public Map<Character, Integer> answerMultipleQuestion(MultipleChoiceQuestion multipleChoiceQuestion, List<Student> students) {
        Map<Character, Integer> map = new HashMap<>();

        List<Choice> choiceList = multipleChoiceQuestion.getListChoices();
        for (Choice c : choiceList) {
            map.put(c.getOption(), 0);
        }

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            int choiceSize = choiceList.size();
            int randomCounter = random.nextInt(choiceSize) + 1 ;

            HashSet<Integer> num = generateUniqueNum(randomCounter);
            Iterator<Integer> numOfAns = num.iterator();
            while (numOfAns.hasNext()) {
                // assign the studentAnswer from the hashset
                int studentAnswer = numOfAns.next();
                // get the chioce the student has answered
                Choice choice = choiceList.get(studentAnswer);
                // if the key is existed
                if (map.containsKey(choice.getOption())) {
                    // get the counter
                    int count = map.get(choice.getOption());
                    // counter + 1
                    map.put(choice.getOption(), ++count);
                }
            }
        }
        return map;
    }

    public static HashSet<Integer> generateUniqueNum(int n) {

        Random random = new Random();
        HashSet hs = new HashSet();
        for (; ; ) {
            int temp = random.nextInt(n);
            hs.add(temp);
            if (hs.size() == n) break;
        }
        return hs;
    }
}