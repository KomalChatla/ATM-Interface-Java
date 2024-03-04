import java.util.Scanner;

public class ATM {
	
	 private User currentUser;  

	    public void authenticateUser(int userID, int userPIN) {
	    	//Check for user credentials
	    	// You can replace with database
	        if (userID == 1234 && userPIN == 5678) {
	            currentUser = new User(userID, userPIN, 10000.00); 
	            System.out.println("Authentication successful.");
	        } else {
	        	//Error message will get displayed if not entered right data
	            System.out.println("Invalid credentials. Please try again.");
	        }
	    }

	    public void checkBalance() {
	    	//This method is used to check the current balance of the current user who is logged into the system.
	        if (currentUser != null) {
	            System.out.println("Your current balance is: $" + currentUser.getAccountBalance());
	        } else {
	            System.out.println("Please authenticate first.");
	        }
	    }
	    public void withdrawMoney(double amount) {
	    	//If the user has money in the account then withdraw method will run
	        if (currentUser != null) {
	            if (amount > currentUser.getAccountBalance()) {
	                System.out.println("Insufficient funds. Your current balance is: $" + currentUser.getAccountBalance());
	            } else {
	                currentUser.setAccountBalance(currentUser.getAccountBalance() - amount);
	                System.out.println("Withdrawal successful...");
	            }
	        } else {
	        	//Error message
	            System.out.println("Please authenticate first...");
	        }
	    }

	    public void depositMoney(double amount) {
	        if (currentUser != null) {
	            currentUser.setAccountBalance(currentUser.getAccountBalance() + amount);
	            System.out.println("Deposit successful. Your new balance is: $" + currentUser.getAccountBalance());
	        } else {
	            System.out.println("Please authenticate first.");
	        }
	    }
	    
		public Object getCurrentUser() {
			return currentUser;
		}
}
