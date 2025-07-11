package ExceptionHandling.Week2;

public class UserBalanceCustomException  {
    private long balance;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    // the custom exception is formed using the throwable class
    // which is checked by default, so we have to use throws in order to catch the checked exception thrown by out custom exception class

    public long withDraw(long amount) throws InsufficientBalance{
       if(amount > balance){
           // throw custom exception here
           throw new InsufficientBalance("low balance");
       }
       setBalance(balance-amount);
       return balance;
    }
}
