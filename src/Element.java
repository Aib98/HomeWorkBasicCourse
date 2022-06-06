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
        System.out.println(questions);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput == rightAnswerIndex) {
            answers[userInput].showText(true);
 //           test.rightCount();
            return true;

        }
        answers[userInput].showText(false);
//        test.wrongCount();
        return false;
    }

    private Test test;

    public void setTest(Test test) {
        this.test = test;


    }

}

