package esercitazione;

public class UsPsw {
	public String username;
	public String password;
	
	public UsPsw(String user,String psw){
	  username=user;
	  password=psw;
	}
	public String uspw(){
		String out;
		out=username+"/n"+password;
		return out;
	}
	

}
