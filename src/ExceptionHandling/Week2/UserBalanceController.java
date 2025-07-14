package ExceptionHandling.Week2;



import java.util.Scanner;

public class UserBalanceController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current Balance: ");
        long balance = sc.nextLong();
        System.out.print("How much do u want to widthdraw? ");
        long withdraw = sc.nextLong();

        UserBalanceCustomException user = new UserBalanceCustomException();
        user.setBalance(balance);

        //try to withdraw

        try{
            long remainingBalance = user.withDraw(withdraw);
            System.out.println( withdraw + " withdrawn from your account! the current balance is : " + user.getBalance());
        }
        catch (InsufficientBalance i){
            System.out.println(i.getMessage());
        }
    }
}
