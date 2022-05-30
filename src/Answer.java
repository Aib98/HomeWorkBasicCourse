import java.security.PublicKey;

public class Answer {
    private String text;

    public Answer(String text) {
        this.text = text;
    }

    public void showText(boolean answer) {
        if (answer) System.out.println(text + "Вы ответили правильно");
        else System.out.println(text + "Вы ошиблись");
    }

    @Override
    public String toString() {
        return text + '\n';
    }
}