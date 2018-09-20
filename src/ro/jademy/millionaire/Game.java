package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private int currentLevel = 1;
    private ArrayList<Question> questionList = new ArrayList<>();

    public Game(ArrayList<Question> questionList) {
        this.questionList.addAll(questionList);
    }

    public void start() {

    }

    public void askQuestion() {
        for (Question q: questionList){
            if(q.getDifficultyLevel() == currentLevel) {

                System.out.println(q.printQuestionAndAnswers());
            }
        }
    }

    public void answerQuestion() {
        Scanner sc = new Scanner(System.in);

//             get user input and check if correct
    }

    public void fiftyFifty() {
//        show the same question but with only two possible answers
    }
}
