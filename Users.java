public class Users{
	private String username;
	private String password;
	private String penpeoID;
	private String phoneNumber;
	public Users() {
	}
	public Users(String username, String password, String penpeoID, String phoneNumber) {
		super();
		this.username = username;
		this.password = password;
		this.penpeoID = penpeoID;
		this.phoneNumber = phoneNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPenpeoID() {
		return penpeoID;
	}
	public void setPenpeoID(String penpeoID) {
		this.penpeoID = penpeoID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}