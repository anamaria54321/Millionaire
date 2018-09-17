package ro.jademy.millionaire;

public class Question {
    public static final int MAX_LEVEL =15;
    public String question;
    public int difficultyLevel;
    public List <Answer> answerList = new ArrayList<>();
    public Answer getCorrectAnswer(){
        for(Answer answer: answerList){
            if (answer.corect){
                return answer;
            }
        }
        return null;
    }
}
