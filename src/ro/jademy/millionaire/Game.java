package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private int currentLevel = 1;

    public void start() {
        Answer q1a1 = new Answer("4", true);
        Answer q1a2 = new Answer("3");
        Answer q1a3 = new Answer("2");
        Answer q1a4 = new Answer("1");
        Question question1 = new Question("Cate picioare are pisica?", 1, Arrays.asList(q1a1, q1a2, q1a3,q1a4));

        Answer q2a1 = new Answer("ovaz", true);
        Answer q2a2 = new Answer("pisici");
        Answer q2a3 = new Answer("caini");
        Answer q2a4 = new Answer("porci");

//        initializam intrebarile si jocul

        Question question2 = new Question("Ce mananca calul?", 1, Arrays.asList(q2a1, q2a2, q2a3, q2a4));
    }

    public askQuestion() {
//        show question on screen
    }

    public answerQuestion() {
//        get user input and check if correct
    }

    public void fiftyFifty() {
//        show the same question but with only two possible answers
    }
}
