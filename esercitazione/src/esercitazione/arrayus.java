package esercitazione;
import java.util.*;
public class arrayus {
	private static ArrayList < UsPsw > arrayuser=new ArrayList<UsPsw>();
	public static String Find(String a,String b){
		int i = 0;
		String out = null;
		boolean ok=false;
		for(i=0; i<arrayuser.size()||ok; i++){
			if (a==arrayuser.get(i).username) ok= true;}
		if (ok){ if(arrayuser.get(i).password==b) 
			out ="true"; else out="password sbagliata";}
		else {arrayuser.add(new UsPsw(a,b));
			out="creato nuovo username ";}
		return out;
	}
	}
	
