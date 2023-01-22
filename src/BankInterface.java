public interface BankInterface {
    double checkBalance();

    String withdrawal(double amount, String password);

    String deposit(double amount);
}
