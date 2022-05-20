package beans;

public class Authentification {
	private String Login;
	private String Password;
	public Authentification() {
		
	setLogin("");
	setPassword("");
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
		
	}
	public boolean Valide(){
		if (Login.equals("USER1")&&(Password.equals("PASS1")))
return true ;
else 
	return false ;
		
		
	}

}