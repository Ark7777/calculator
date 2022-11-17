import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try {
            int n1, n2, ans = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            System.out.println("Enter the operator( + , - , * , / )");
            char op = sc.next().charAt(0);
            switch (op) {
                case '+':
                    ans = n1 + n2;
                    break;
                case '-':
                    ans = n1 - n2;
                    break;
                case '*':
                    ans = n1 * n2;
                    break;
                case '/':
                    ans = n1 / n2;
                    break;
                default:System.out.println("Error!");
                return;
            }
            System.out.println("Answer is " + ans);
        }
        catch(Exception op){
                System.out.println("The number cant be divided by zero exception ");
            }
        }
    }


