package OSExam;
public class FirstTenEvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 10) {
            System.out.println(number);
            number += 2;
            count++;
        }
    }
}