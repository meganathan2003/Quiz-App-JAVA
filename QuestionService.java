
import java.util.Scanner;

public class QuestionService {

    // Create a new question array length of 5
    Question[] questions = new Question[5];
    String userSelect[] = new String[5];

    public QuestionService() {
        // Create new hardcode to create question
        questions[0] = new Question(1, "Which concept is part of OOP?", "Inheritance", "Pointer", "Heap", "Stack", "Inheritance");
        questions[1] = new Question(2, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus", "Mars");
        questions[3] = new Question(4, "Who wrote 'Hamlet'?", "Mark Twain", "J.K. Rowling", "William Shakespeare", "Charles Dickens", "William Shakespeare");
        questions[4] = new Question(5, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");

    }

    public void playQuiz() {
        int i = 0;
        // to Display all question create a for loop
        for (Question q : questions) {
            System.out.println("Question No. :" + q.getId());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            // Now we get the input from the user by using Scanner
            Scanner input = new Scanner(System.in);
            userSelect[i] = input.nextLine();
            i++;
        }
    }

    /**
     * This method print all score to the users
     *
     * @return void
     *
     */
    public void printScore() {

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = userSelect[i];

            // check the answer
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your Score is :" + score);

    }

}
