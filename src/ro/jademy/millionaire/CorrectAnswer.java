package ro.jademy.millionaire;

public class CorrectAnswer extends Answer{
    public CorrectAnswer(String answer){
        super(answer);
    }

    @Override
    public boolean isCorrect() {
        return true;
    }
    @Override
    public String getAnswer() {
        return answer;
    }
}
