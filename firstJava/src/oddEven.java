import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1= num.nextInt();


        if (num1%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}