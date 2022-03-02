public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
    System.out.println("Hello!");
  }
  public void checkBalance(){
    //Check balance:
    
    System.out.println("Your balance is "+ balance);
  }

  public void deposit(int amountToDeposit){
    //Deposit:
    int afterDeposit = balance + amountToDeposit;
    balance = afterDeposit;
    System.out.println("You just deposited "+ amountToDeposit);
    checkBalance();
  }
  public int withdraw(int amountToWithdraw){
    //Withdrawing:
    int afterWithdraw = balance - amountToWithdraw;
    balance = afterWithdraw;
    System.out.println("You just withdrew "+ amountToWithdraw);
    checkBalance();
    return amountToWithdraw;
  }
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    savings.checkBalance();
    savings.deposit(500);
    savings.withdraw(300);
    
  }       
}
