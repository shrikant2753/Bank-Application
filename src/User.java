import java.util.Objects;
import java.util.UUID;

public class User implements BankInterface {
    private String name;
    private String accountNo;
    private String password;
    private double balance;

    public User(String name, String password, double balance) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String withdrawal(double amount, String entPassword) {
        if(Objects.equals(entPassword, password)){
            if(amount <= balance){
                balance -= amount;
            }
            else
                System.out.println("Insufficient balance");
        }
        else
            System.out.println("Wrong password");
        return "Your account balance : " + balance;
    }

    @Override
    public String deposit(double amount) {
        if(amount>=0){
            balance += amount;
        }
        else{
            System.out.println("Enter valid amount to deposit ");
        }
        return "Your account balance : " + balance;
    }
}
