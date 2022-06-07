public class Test {
    private Element[] questions;
    private int rightAnswerCount = 0;
    private int wrongAnswerCount = 0;

    public Test(Element[] questions) {
        this.questions = questions;
    }

    public void passTest() {
             for (int n = 0; n < questions.length; n++) {
                 boolean elementResalt = questions[n].ask();
                 if (elementResalt){
                     rightAnswerCount ++;
                 }
                 else {
                     wrongAnswerCount++;
                 }
             }
        System.out.println('\n' + "Итого правильных ответов: " + rightAnswerCount);
        System.out.println("Итого ошибочных ответов: " + wrongAnswerCount);
    }
}