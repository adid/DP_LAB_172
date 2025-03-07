import java.time.LocalDateTime;

public class Transaction {
    private String accNo;
    private Double amount;
    private String transactionType;
    private LocalDateTime timestamp;
    private String reference;

    public Transaction(String transactionType, String accNo, Double amount, String reference){
        this.transactionType = transactionType;
        this.accNo = accNo;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.reference = reference;
    }
}
