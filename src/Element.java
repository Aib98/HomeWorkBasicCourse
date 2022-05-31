import java.util.Arrays;
import java.util.Scanner;

public class Element {
    private String questions;
    private Answer[] answers;
    private int rightAnswerIndex;

    public Element(String questions, Answer[] answers, int rightAnswerIndex) {
        this.questions = questions;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }


    @Override
    public String toString() {
        return "Вопрос: " + questions + '\n' +
                "Варианты ответов:" + Arrays.toString(answers) +
                "Введите ваш ответ: " + ask() +
                ", test=" + test +
                '}';
    }

    public boolean ask() {
        Scanner scanner = new Scanner(System.in);
        if (Integer.parseInt(scanner.nextLine()) == rightAnswerIndex) {
            return true;
        }
        return false;
    }


    private Test test;

    public void setTest(Test test) {
        this.test = test;
    }

}

