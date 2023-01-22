import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, password and balance : ");
        String name = sc.nextLine();
        String pass = sc.next();
        double balance = sc.nextDouble();
        User user = new User(name, pass, balance);

        //check balance
        System.out.println(user.checkBalance());

        //deposit
        System.out.println(user.deposit(1000));

        //withdrawal
        System.out.println("enter amount to be withdrawal and password : ");
        double amt = sc.nextDouble();
        String pas = sc.next();
        System.out.println(user.withdrawal(amt, pas));
    }
}