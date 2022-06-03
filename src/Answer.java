import java.security.PublicKey;

public class Answer {
    private String text;

    public Answer(String text) {
        this.text = text;
    }

    public void showText(boolean answer) {
        if (answer) System.out.println("Вы выбрали ответ: " + text + " - ответ правильный");
        else System.out.println("Вы выбрали ответ: " + text + " - ответ ошибочный");
    }

    @Override
    public String toString() {
        return text;
    }

    public String getText() {
        return text;
    }
}