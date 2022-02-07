package arrays;

public class ArraysDemos {
    public static void main(String[] args) {
        // search an array sample
        int [] list = {23, 17, 8, 5 , 90, 120, 4, 45};
        int searchKey = 4;
        int loc = 0;
        while (loc<list.length && list[loc] != searchKey){
            loc++;
        }
        if (loc == list.length){
            System.out.println(searchKey+" serch key was not found");
        }else{
            System.out.println("searchKey+\" serch key was found at "+loc);
        }

    }
}
