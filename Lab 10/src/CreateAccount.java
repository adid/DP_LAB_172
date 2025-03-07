import java.util.Map;

public class CreateAccount implements Command{
    private String accNo;
    private String accName;
    private String branch;
    private BankAccount account;

    public CreateAccount(String accNo, String accName, String branch) {
        this.accNo = accNo;
        this.accName = accName;
        this.branch = branch;
    }

    @Override
    public void execute() {
        account = new BankAccount(accNo, accName);
        Bank.addAccount(branch,account);
    }
}
