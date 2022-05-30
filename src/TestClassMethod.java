public class TestClassMethod {
    @Override
    public String toString() {
        return "TestClassMethod{}";
    }

    public static void main(String[] args) {
        int[] rightAnswerIndex = {3, 3, 1};
        String[] allQuestion = {"В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "Какой применяется цикл, когда не известно количество итераций?"
        };
        String[] [] allAnswer = {{'\n'+"1. cs"+'\n'+ "2. java"+'\n'+ "3. class"+'\n'+ "4. exe"},
                {'\n'+ "1. commit"+'\n'+  "2. push"+'\n'+  "3. clone"+'\n'+  "4. copy"},
                {'\n'+ "1. While"+'\n'+  "2. for"+'\n'+  "3. loop"}  //убрать вопросы и ответы
        };

//        Test test = new Test();

        for (int i = 0; i < allQuestion.length; i++) {
            Answer[] answer = new Answer[allAnswer[i].length];
                for (int k = 0; k < answer.length; k++) {
                    answer[k] = new Answer(allAnswer[i][k]);
            Element element = new Element(allQuestion[i], answer, rightAnswerIndex [i]);
            System.out.println(element);

            }
        }

    }
}



