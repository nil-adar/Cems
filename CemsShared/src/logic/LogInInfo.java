package logic;

import java.io.Serializable;

public class LogInInfo implements Serializable  {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;// to avoid warnings
	private String userName;
	private String password;
	public LogInInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}

}
