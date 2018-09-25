package ro.jademy.millionaire;

import java.util.Objects;

public abstract class Answer {
    public String answer;

    /**
     * Constructor for incorrect answer.
     *
     * @param answer
     */
    public Answer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }


    public abstract boolean isCorrect();

    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                '}';
    }
}
