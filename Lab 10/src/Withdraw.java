public class Withdraw implements Command{

    private BankAccount account;
    private Double amount;
    private String reference;
    private Transaction transaction;

    public Withdraw(BankAccount account, Double amount, String reference) {
        this.account = account;
        this.amount = amount;
        this.reference = reference;
    }


    public Double withdraw(){
        Double balance = account.getBalance() - amount;
        account.setBalance(balance);
        transaction = new Transaction("Withdraw",account.getAccNo(),amount,reference);
        account.addTransaction(transaction);
        return balance;
    }
    public void execute(){
        Double balance = withdraw();
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
