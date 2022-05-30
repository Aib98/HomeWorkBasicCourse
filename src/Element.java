import java.util.Arrays;
import java.util.Scanner;

public class Element {
    private String questions;
    private Answer [] answers;
    private int rightAnswerIndex;

    public Element(String questions, Answer[] answers, int rightAnswerIndex) {
        this.questions = questions;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }



    public void setRightAnswerIndex(int rightAnswerIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public int getRightAnswerIndex() {
        return rightAnswerIndex;
    }



    public boolean ask (){// Доработать! в классе Element в метод public boolean ask (int rightAnswerIndex)
        // не стоит передавать аргумент, так как rightAnswerIndex - это уже поле класса
        Scanner scanner = new Scanner(System.in);
        if(Integer.parseInt(scanner.nextLine()) == rightAnswerIndex) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return  "Вопрос: " + questions + '\n' +
                "Варианты ответов:" + Arrays.toString(answers) + '\n' +
                "Введите ваш ответ: "+ ask();
    }


    private Test test;
    public void setTest(Test test) {
        this.test = test;
    }

}

