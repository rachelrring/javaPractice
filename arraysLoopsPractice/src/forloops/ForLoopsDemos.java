package forloops;
import java.util.Scanner;
public class ForLoopsDemos {
    public static void main(String[] args) {
//        for (initialisation; guard; makeprogress) {
//            body of loop
//        }

        final int END = 20;
        Scanner in = new Scanner(System.in);
        int sum=0, count;
        System.out.println("Enter start number, end will be 20");
        count=in.nextInt();
        for (; count <= END; count++){
            sum = sum+count;
            System.out.println("Number:\t"+count);
        }
        System.out.println("Sum:\t"+sum);

        // Nested for loops
        final int THREE = 3;
        final int LIMIT = 12;
        int number, product, times;
        for (number = 1; number <= THREE; number++){
            for (times = 1; times <= LIMIT; times++){
                product = number * times;
                System.out.println(number+" * "+times+" is "+product);
            }
        }
    }
}
