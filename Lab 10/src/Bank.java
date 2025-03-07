import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static Map<String, BankAccount> bankAccounts;

    public Bank(Map<String, BankAccount> bankAccounts) {
        bankAccounts = new HashMap<>();
    }

    public static void addAccount(String branch, BankAccount account){
        bankAccounts.put(branch, account);
    }
}
