package whileloops;
import java.util.Scanner;
public class WhileLoopsDemos {
    public static void main(String[] args) {
        int count = 1;
        while (count < 5){
            System.out.println("Count is:\t"+ count);
            count++;
        }
        System.out.println("While loop finished");

        // this computes the product of the first 20 odd integers
        int product = 1, num = 1, newCount = 20, lastNum;
        lastNum = 2*newCount-1;
        while (num <= lastNum){
            product = product * num;
            System.out.println(num);
            num = num + 2;
        }
        System.out.println("Product:\t"+product);

        // input validation using a while loop
        Scanner in = new Scanner(System.in);
        double mark;
        System.out.println("Enter student mark, range 0...100");
        mark = in.nextDouble();
        while (mark < 0 || mark > 100){
            System.out.println("ERROR!");
            System.out.println("Enter student mark, range 0...100");
            mark = in.nextDouble();
        }
        System.out.println("You entered:\t"+mark);
    }
}
