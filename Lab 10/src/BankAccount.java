import java.util.List;

public class BankAccount {
    private String accNo;
    private String accName;
    private Double balance;
    private List<Transaction> transactions;

    public BankAccount(String accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
    }

    public Transaction addTransaction(Transaction transaction){
        transactions.add(transaction);
        return transaction;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
