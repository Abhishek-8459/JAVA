import java.util.Scanner;

class Account{
    private String AccountHolderName;
    private long AccountNumber;
    private double accountBalance;
    private double dailyWithdrawalLimit;
    private double dailyWithdrawnAmount;
    Account(String Name , long number , double deposit , double limit ){
        this.AccountHolderName=Name;
        this.accountBalance=deposit;
        this.dailyWithdrawalLimit=limit;
        this.AccountNumber=number;
        this.dailyWithdrawnAmount=0.0;
    }

    void depositMoney(double amt){
        if(amt<0){
            System.out.println("Enter Valid Amount");
        }
        else{
            accountBalance+=amt;
            System.out.println("Amount deposited\nYour current balance is: "+accountBalance+"/-");
        }
    }
    void withdrawMoney(double amt){
        if(accountBalance-amt<0){
            System.out.println("Insufficient Funds");
        }
        else if(dailyWithdrawnAmount+amt>=dailyWithdrawalLimit){
            System.out.println("You have reached your daily withdrawn limit.");
        }
        else{
            accountBalance=accountBalance-amt;
            dailyWithdrawnAmount+=amt;
            System.out.println(amt+"/- Withdraw Sucessful\n Your current balance is: "+accountBalance+"/-");
        }
    }
    double checkBalance(){
        return accountBalance;
    }
    void Account_Information(){
        System.out.println("The account holder name is: "+AccountHolderName);
        System.out.println("The account number is: "+AccountNumber);
        System.out.println("The account balance is: "+accountBalance+"/-");
        System.out.println("Daily withdrawal limit: "+dailyWithdrawalLimit+"/-");
        System.out.println("Remaining daily withdrawal limit: "+(dailyWithdrawalLimit-dailyWithdrawnAmount)+"/-");
    }
    void resetDailyLimit(){
        dailyWithdrawnAmount=0;
    }

}
public class Banking_sys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Gaikwad Bank");
        System.out.println("Enter Your details: \nEnter your name: ");
        String name= sc.next();
        System.out.print("Enter your Account Number: ");
        long num = sc.nextLong();
        System.out.println();
        System.out.print("Enter Initial deposit amount: ");
        double amt = sc.nextDouble();
        System.out.println();
        System.out.print("Enter your daily withdrawal limit: ");
        double lim = sc.nextDouble();
        System.out.println();
        Account ac1= new Account(name,num,amt,lim);
        System.out.println("Your Account is created");
        int n = 6;
        do {
            System.out.println("Select operation to perform\n1.Deposit Money\n2.Withdraw Money\n3.Display Account Information \n4.Check balance \n5.Reset Daily Withdrawal Limit\n6.Exit");
             n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double am = sc.nextDouble();
                    System.out.println();
                    ac1.depositMoney(am);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double am1= sc.nextDouble();
                    System.out.println();
                    ac1.withdrawMoney(am1);
                    break;
                case 3:
                    System.out.println("The account Information is: ");
                    ac1.Account_Information();
                    break;
                case 4:
                    double bal = ac1.checkBalance();
                    System.out.print("Your Account balance is: "+bal+"/-");
                    System.out.println();
                    break;
                case 5:
                    ac1.resetDailyLimit();
                    System.out.println("limit reset done!");
                    break;
                case 6:
                    break;

            }
        }while(n!=6);
    }
}
