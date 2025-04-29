import java.util.Scanner;

public class Homework {
	private int id;
	  private static double balance;
	  public Homework() { }
	  public Homework(int id) {
	      this.id = id;
	      this.balance = 100;
	  }

	  public void setBalance(double newBalance) {
	      balance = newBalance;
	  }

	  public void setID(int newID) {
	      id = newID;
	  }

	  public double Balance() {
	      return balance;
	  }

	  public int getID() {
	      return id;
	  }
	  
	  public double withDraw(double withdraw) {
	      return balance = balance - withdraw;
	  }

	  public double deposit(double deposit) {
	      return balance = balance + deposit;
	  }


	  public static void main(String[] args) {

		  Homework[] accounts = new Homework[10];
	     for (int x = 0; x < accounts.length; x++) {
	        accounts[x] = new Homework(x);
	     }
	     Scanner input = new Scanner(System.in);
	     System.out.print("Enter an ID: ");
	     int enteredID;
	     do {
	        enteredID = input.nextInt();
	        System.out.println(" ");
	        if (enteredID <= 9 && enteredID >=0 && enteredID == accounts[enteredID].getID()) {
	            do {
	            	System.out.println("Main Menu: ");
	                System.out.println("1: check balance");
	                System.out.println("2: withdraw");
	                System.out.println("3: deposit");
	                System.out.println("4: exit");
	               System.out.print("Enter a choice: ");
	               
	               int choice = input.nextInt();
	               input.nextLine();
	               if (choice == 1) {
	                   System.out.println("The balance is: " + accounts[enteredID].Balance());
	                   System.out.println(" ");
	               }
	               else if (choice == 2) {
	                    System.out.print("Enter withdraw amount: ");
	                    int withdraw = input.nextInt();
	                    if (balance >= withdraw) {
	                        accounts[enteredID].withDraw(withdraw);
	             		   
	             	   }
	             	   else {
	             		   System.out.print("Withdraw amount is too high. You are redirecting to deposit menu.");
	                        System.out.print("Enter deposit amount: ");
	                        int deposit = input.nextInt();
	                        accounts[enteredID].deposit(deposit);
	             	   }System.out.println(" ");
	               }
	             	   
	                    
	               else if (choice == 3) {
	                    System.out.print("Enter deposit amount: ");
	                    int deposit = input.nextInt();
	                    accounts[enteredID].deposit(deposit);
	                    System.out.println(" ");
	               }
	                    
	               else if (choice == 4) {
	                    System.out.println("Exit");
	                    System.out.println("Enter an ID:");
	                    break;
	                }
	             } while (true);
	          }
	          else{
	              System.out.print("Enter correct id!: ");
	          }

	      }while(true);
	  }
}
