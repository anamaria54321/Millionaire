package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Question {
    public static final int MAX_LEVEL = 3;
    private String question;
    private int difficultyLevel;
    private ArrayList<Answer> answerList = new ArrayList<>();

    public Question(String question, int difficultyLevel, List<Answer> answerList) {
        this.question = question;
        this.difficultyLevel = difficultyLevel;
        this.answerList.addAll(answerList);
    }

//    public Answer getCorrectAnswer() {
//        for (Answer answer : answerList) {
//            if (answer.IsCorrect()) {
//                return answer;
//            }
//        }
//        return null;
//    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Answer> getAnswerList() {
        return answerList;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void printQuestionAndAnswers(){
        System.out.println(getQuestion());

        for (Answer answer : getAnswerList()) {
            System.out.println(answer.getAnswer());
    }
}}