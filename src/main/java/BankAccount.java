import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * @param setName sets the name
     */
    public void setOwnerName(final String setName) {
        this.ownerName = setName;
    }

    /**
     * @param setAccountBalance sets the the account balance
     */
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    /**
     *
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @return
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     *
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     *
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}
