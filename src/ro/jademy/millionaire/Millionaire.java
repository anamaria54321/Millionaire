package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Millionaire {

    private static ArrayList<Question> level1QuestionList = new ArrayList<>();
    private static ArrayList<Question> level2QuestionList = new ArrayList<>();
    private static ArrayList<Question> level3QuestionList = new ArrayList<>();

    public static void main(String[] args) {
        initList();

        ArrayList<Question> gameQuestions = getGameQuestionList();

        Game game = new Game(gameQuestions);
//        System.out.println(gameQuestions);
        System.out.println("Welcome to Who Wants to be a Millionaire!");
        for (Question q : gameQuestions) {
            q.printQuestionAndAnswers();
            System.out.println(" Enter the correct answer");
            String answer = answerQuestion(); // A, B, C, D sau fifty fifty
            game.checkAnswer(q, answer);
//            if (answerQuestion().equals(q.new CorrectAnswer().isCorrect())){
//                System.out.println("Congratulations, you answered right!");
//            }
//            else {
//                System.out.println("You lose!");
//               }
        }


//            q.checkAnswer();
//        game.askQuestion();
    }

    private static void initList() {
        CorrectAnswer q1a1 = new CorrectAnswer("4");
        WrongAnswer q1a2 = new WrongAnswer("3");
        WrongAnswer q1a3 = new WrongAnswer("2");
        WrongAnswer q1a4 = new WrongAnswer("1");

        Question question1 = new Question("Cate picioare are pisica?", 1, Arrays.asList(q1a1, q1a2, q1a3, q1a4));

        CorrectAnswer q2a1 = new CorrectAnswer("ovaz");
        WrongAnswer q2a2 = new WrongAnswer("pisici");
        WrongAnswer q2a3 = new WrongAnswer("caini");
        WrongAnswer q2a4 = new WrongAnswer("porci");
        Question question2 = new Question("Calul mananca?", 1, Arrays.asList(q2a1, q2a2, q2a3, q2a4));

        CorrectAnswer q3a1 = new CorrectAnswer("Africa");
        WrongAnswer q3a2 = new WrongAnswer("Europa");
        WrongAnswer q3a3 = new WrongAnswer("Asia");
        WrongAnswer q3a4 = new WrongAnswer("America");
        Question question3 = new Question("Egiptul este situat in?", 1, Arrays.asList(q3a1, q3a2, q3a3, q3a4));

        level1QuestionList.addAll(Arrays.asList(question1, question2, question3));

        CorrectAnswer q4a1 = new CorrectAnswer("Constanta");
        WrongAnswer q4a2 = new WrongAnswer("Prahova");
        WrongAnswer q4a3 = new WrongAnswer("Tulcea");
        WrongAnswer q4a4 = new WrongAnswer("Brasov");
        Question question4 = new Question("Orasul Mangalia este situat in judetul", 2, Arrays.asList(q4a1, q4a2, q4a3, q4a4));

        CorrectAnswer q5a1 = new CorrectAnswer("Nil");
        WrongAnswer q5a2 = new WrongAnswer("Dunare");
        WrongAnswer q5a3 = new WrongAnswer("Dambovita");
        WrongAnswer q5a4 = new WrongAnswer("Olt");
        Question question5 = new Question("Crocodilul traieste in ?", 2, Arrays.asList(q5a1, q5a2, q5a3, q5a4));

        CorrectAnswer q6a1 = new CorrectAnswer("Pamant");
        WrongAnswer q6a2 = new WrongAnswer("Luna");
        WrongAnswer q6a3 = new WrongAnswer("Mercur");
        WrongAnswer q6a4 = new WrongAnswer("Jupiter");
        Question question6 = new Question("Din cate stim oammenii traiesc pe", 2, Arrays.asList(q6a1, q6a2, q6a3, q6a4));

        level2QuestionList.addAll(Arrays.asList(question4, question5, question6));

        CorrectAnswer q7a1 = new CorrectAnswer("mor");
        WrongAnswer q7a2 = new WrongAnswer("plang");
        WrongAnswer q7a3 = new WrongAnswer("se bucura");
        WrongAnswer q7a4 = new WrongAnswer("isi cer scuze");
        Question question7 = new Question("Ce fac majoritatea albinelor dupa ce inteapa ? ", 3, Arrays.asList(q7a1, q7a2, q7a3, q7a4));

        CorrectAnswer q8a1 = new CorrectAnswer("vulpea");
        WrongAnswer q8a2 = new WrongAnswer("cainele");
        WrongAnswer q8a3 = new WrongAnswer("maimuta");
        WrongAnswer q8a4 = new WrongAnswer("furnica");
        Question question8 = new Question("Carui animal i s-a dus vestea in literatura populara si in fabule ca este siret ?  ?", 3, Arrays.asList(q8a1, q8a2, q8a3, q8a4));

        CorrectAnswer q9a1 = new CorrectAnswer("4");
        WrongAnswer q9a2 = new WrongAnswer("5");
        WrongAnswer q9a3 = new WrongAnswer("3");
        WrongAnswer q9a4 = new WrongAnswer("6");
        Question question9 = new Question("Cate laturi are un patrulater concav ? ", 3, Arrays.asList(q9a1, q9a2, q9a3, q9a4));

        level3QuestionList.addAll(Arrays.asList(question7, question8, question9));
    }

    public static ArrayList<Question> getGameQuestionList() {

        Random r = new Random();
        ArrayList<Question> gameQuestionList = new ArrayList<>();

        int level1RandomIndex = r.nextInt(level1QuestionList.size()); // [0, 3)
        gameQuestionList.add(level1QuestionList.get(level1RandomIndex));
        gameQuestionList.add(level2QuestionList.get(level1RandomIndex));
        gameQuestionList.add(level3QuestionList.get(level1RandomIndex));


        return gameQuestionList;
    }

    public static String answerQuestion() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}

