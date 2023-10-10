import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("First Number is :");
            int A = sc.nextInt();
            System.out.println("Second Number is :");
            int B = sc.nextInt();
            System.out.println("Choose The Options From + , - , / , * , % ");
            char operator = sc.next().charAt(0);
            switch(operator) {
                case '+' : System.out.println(A+B);
                            break;

                case '-' : System.out.println(A-B);
                            break;

                case '*' : System.out.println(A*B);
                            break;

                case '/' : System.out.println(A/B);
                            break;

                case '%' : System.out.println(A%B);
                            break;

                default : System.out.println("Invalid Input");
            }
        }
    }
}
