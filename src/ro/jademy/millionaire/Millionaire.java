package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Millionaire {

    private static ArrayList<Question> level1QuestionList = new ArrayList<>();
    private static ArrayList<Question> level2QuestionList = new ArrayList<>();
    private static ArrayList<Question> level3QuestionList = new ArrayList<>();

    public static void main(String[] args) {
        initList();

        ArrayList<Question> gameQuestions = getGameQuestionList();
        Game game = new Game(gameQuestions);

    }

    private static void initList() {
        Answer q1a1 = new Answer("4", true);
        Answer q1a2 = new Answer("3");
        Answer q1a3 = new Answer("2");
        Answer q1a4 = new Answer("1");
        Question question1 = new Question("Cate picioare are pisica?", 1, Arrays.asList(q1a1, q1a2, q1a3, q1a4));

        Answer q2a1 = new Answer("ovaz", true);
        Answer q2a2 = new Answer("pisici");
        Answer q2a3 = new Answer("caini");
        Answer q2a4 = new Answer("porci");
        Question question2 = new Question("Calul mananca?", 1, Arrays.asList(q2a1, q2a2, q2a3, q2a4));

        Answer q3a1 = new Answer("Africa", true);
        Answer q3a2 = new Answer("Europa");
        Answer q3a3 = new Answer("Asia");
        Answer q3a4 = new Answer("America");
        Question question3 = new Question("Egiptul este situat in?", 1, Arrays.asList(q3a1, q3a2, q3a3, q3a4));

        level1QuestionList.addAll(Arrays.asList(question1, question2, question3));

        Answer q4a1 = new Answer("Constanta", true);
        Answer q4a2 = new Answer("Prahova");
        Answer q4a3 = new Answer("Tulcea");
        Answer q4a4 = new Answer("Brasov");
        Question question4 = new Question("Orasul Mangalia este situat in judetul", 2, Arrays.asList(q4a1, q4a2, q4a3, q4a4));

        Answer q5a1 = new Answer("Nil", true);
        Answer q5a2 = new Answer("Dunare");
        Answer q5a3 = new Answer("Dambovita");
        Answer q5a4 = new Answer("Olt");
        Question question5 = new Question("Crocodilul traieste in ?", 2, Arrays.asList(q5a1, q5a2, q5a3, q5a4));

        Answer q6a1 = new Answer("Pamant", true);
        Answer q6a2 = new Answer("Luna");
        Answer q6a3 = new Answer("Mercur");
        Answer q6a4 = new Answer("Jupiter");
        Question question6 = new Question("Din cate stim oammenii traiesc pe", 2, Arrays.asList(q6a1, q6a2, q6a3, q6a4));

        level2QuestionList.addAll(Arrays.asList(question4, question5, question6));

        Answer q7a1 = new Answer("mor", true);
        Answer q7a2 = new Answer("plang");
        Answer q7a3 = new Answer("se bucura");
        Answer q7a4 = new Answer("isi cer scuze");
        Question question7 = new Question("Ce fac majoritatea albinelor dupa ce inteapa ? ", 3, Arrays.asList(q7a1, q7a2, q7a3, q7a4));

        Answer q8a1 = new Answer("vulpea", true);
        Answer q8a2 = new Answer("cainele");
        Answer q8a3 = new Answer("maimuta");
        Answer q8a4 = new Answer("furnica");
        Question question8 = new Question("Carui animal i s-a dus vestea in literatura populara si in fabule ca este siret ?  ?", 3, Arrays.asList(q8a1, q8a2, q8a3, q8a4));

        Answer q9a1 = new Answer("4", true);
        Answer q9a2 = new Answer("5");
        Answer q9a3 = new Answer("3");
        Answer q9a4 = new Answer("6");
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
}
