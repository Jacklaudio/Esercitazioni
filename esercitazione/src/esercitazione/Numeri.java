package esercitazione;
import java.util.*;
public class Numeri {
	
 public static String getStringNumbers(){
		String out = null;
		Random rn = new Random();
		int x;
		for (int i=0; i<10; i++){
        x = rn.nextInt(50);
		out += x;
		}
		
		return out;
		}
}
