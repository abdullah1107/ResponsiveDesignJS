import java.util.Observable;

public class Model extends Observable {
	String userName;
	String email;
	private int roll;
	public static int USERNAME = 0;
	public static int EMAIL = 1;
	public static int ROLL = 2;

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public void setUserName(String userName) {
		String oldString = userName;
		this.userName = userName;
		setChanged();
		ChangedProperty<Integer, String> changedProperty = new ChangedProperty<Integer, String>(
				Model.USERNAME, oldString, userName);
		notifyObservers(changedProperty);
	}

	public void setEmail(String email) {
		String oldString = email;
		this.email = email;
		setChanged();
		ChangedProperty<Integer, String> changedProperty = new ChangedProperty<Integer, String>(
				Model.EMAIL, oldString, email);
		notifyObservers(changedProperty);
		;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		int oldString = roll;
		this.roll = roll;
		setChanged();
		ChangedProperty<Integer, Integer> changedProperty = new ChangedProperty<Integer, Integer>(
				Model.ROLL, oldString, roll);
		notifyObservers(changedProperty);
		;
	}
}
