import java.util.*;
public class greetingMessage {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Please enters your name:");
        String name= n.nextLine();
        System.out.println("Welcome to the world Mr." + name);
    }
}
