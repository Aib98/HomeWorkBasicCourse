public class Test {//Доработать! - в классе Test надо реализовать метод passTest()
    private Element[] questions;
    private int rightAnswerCount = 0;

    public Test(Element[] questions) {
        this.questions = questions;
    }
    public void rightCount(){
        rightAnswerCount++;
    }
    public Test(){
    }

    public int getRightAnswerCount() {
        return rightAnswerCount;
    }

    public void passTest() {
//        boolean checkedAnswer =
//        if (checkedAnswer) passTest();
//        else passTest();
    }
//

//        System.out.println('\n' + "Итого:" + '\n' + "Правильных ответов: " + test.getRightAnswerCount());
//        int count = rightAnswerIndex.length;
//        int right = test.getRightAnswerCount();
//        int wrong = count - right;
//        System.out.println("Ошибочных ответов: " + wrong);


}
//    public void setRightAnswerCount(int rightAnswerCount) {
//        this.rightAnswerCount = rightAnswerCount;
//    }
//
//    public int getRightAnswerCount() {
//        return rightAnswerCount;
//    }
//
//    protected Question question;
//    public void setQuestion(Question question) {
//        this.question = question;
//    }
//
//    public String[] getQuestion() {
//        return Question;
//    }
//
//    private void passTest(){
//    }

