import java.time.LocalDateTime;

public class Deposit implements Command{

    private BankAccount account;
    private Double amount;
    private String reference;
    private Transaction transaction;

    public Deposit(BankAccount account, Double amount, String reference) {
        this.account = account;
        this.amount = amount;
        this.reference = reference;
    }

    public Double deposit(){
        Double balance = account.getBalance() + amount;
        account.setBalance(balance);
        transaction = new Transaction("Deposit",account.getAccNo(),amount,reference);
        account.addTransaction(transaction);
        return balance;
    }
    public void execute(){
        Double balance = deposit();
        System.out.println(balance);
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
