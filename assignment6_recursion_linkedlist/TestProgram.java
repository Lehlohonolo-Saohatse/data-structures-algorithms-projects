import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyLinkedList<Integer> questionList = new MyLinkedList<>();

        while (true) {
            System.out.print("Enter a number (a negative number to STOP): ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            questionList.append(number);
        }

        System.out.println("Question List = " + questionList);

        MyLinkedList<Integer> answerList = questionList.Multiply();
        System.out.println("Answer List = " + answerList);

        scanner.close();
    }
}