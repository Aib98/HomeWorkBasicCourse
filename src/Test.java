public class Test {//Доработать! - в классе Test надо реализовать метод passTest()
    private Element[] questions;
    private int rightAnswerCount = 0;
    private int wrongAnswerCount = 0;

    public Test(Element[] questions) {
        this.questions = questions;
    }


    public void rightCount(){
        rightAnswerCount = rightAnswerCount+1;

    }
    public void wrongCount(){
        wrongAnswerCount = wrongAnswerCount+1;
    }
    public Test(){
    }

    public int getRightAnswerCount() {
        return rightAnswerCount;
    }

    public int getWrongAnswerCount() {
        return wrongAnswerCount;
    }

    public void showText(boolean answer) {// Пробую посчитать кол-во правильных ответов
        if (answer) rightCount();
        else wrongCount();
    }

    public void passTest() {
             for (int n = 0; n < questions.length; n++) {
            questions[n].ask();
                 System.out.println(rightAnswerCount);
                 System.out.println(wrongAnswerCount);
         }
    }

    public void setRightAnswerCount(int rightAnswerCount) {
        this.rightAnswerCount = rightAnswerCount;
    }

    public void setWrongAnswerCount(int wrongAnswerCount) {
        this.wrongAnswerCount = wrongAnswerCount;
    }

}
