public class User {
	//This class is used for representation of each user.
    private int userID;
    private int userPIN;
    private double accountBalance;

    public User(int userID, int userPIN, double accountBalance) {
        this.userID = userID;
        this.userPIN = userPIN;
        this.accountBalance = accountBalance;
    }
    // We need to provide Getters and Setters for all attributes
    public int getUserID() {
        return userID;
    }

    public int getUserPIN() {
        return userPIN;
    }

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double d) {
		this.accountBalance = d;
	}
}
