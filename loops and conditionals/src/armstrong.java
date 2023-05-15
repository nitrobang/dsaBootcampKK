import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
//        Scanner n= new Scanner(System.in);
//        int num = n.nextInt();
//        boolean isArm=arms(num);
//        System.out.println(isArm);

        for (int i=100; i<=999; i++)
            if (arms(i)==true){
                System.out.println(i);
            }

    }

    static boolean arms(int num){
        int arm=0;
        int original= num;
        while(num>0) {

            int remainder = num % 10;
            num = num / 10;
            arm = arm + remainder * remainder * remainder;

        }
        return arm==original;

    }
}
