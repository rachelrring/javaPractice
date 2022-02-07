package dowhileloops;

public class DoWhileLoopsDemos {
    public static void main(String[] args) {
        // this prints numbers 1-5
        int i = 1;
        do{
            System.out.println("Number:\t"+i);
            i++;
        }while(i<=5);
        System.out.println("Out of loop");
    }
}
