package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private Scanner sc = new Scanner(System.in);
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
                q.printQuestionAndAnswers();
                answerQuestion();
            }
        }
    }

    private String answerQuestion() {

        return sc.next();
//             get user input and check if correct
    }
    public void checkAnswer(Question question) {
        String answerPlayer = answerQuestion();
        Answer correctAnswer = question.getCorrectAnswer();
        if (answerPlayer.equals(correctAnswer)) {
            System.out.println("Congratulations, you answered right!");
        } else {
            System.out.println("You lose!");
            System.exit(0);
        }

    }

    public void fiftyFifty() {
//        show the same question but with only two possible answers
    }
}
