package esercitazione;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;
public class MyServer {
private int port;
private ServerSocket serverSocket;
public MyServer(int port) {
this.port = port;
}
public void startServer() throws IOException {
	boolean login = false;
	boolean giusto = false;
	int i;
	String out2 = null;
	// apro una porta TCP
	serverSocket = new ServerSocket(port);
	System.out.println("Server socket ready on port: " + port);
	// resto in attesa di una connessione
	Socket socket = serverSocket.accept();
	System.out.println("Received client connection");
	// apro gli stream di input e output per leggere e scrivere
	// nella connessione appena ricevuta
	Scanner in = new Scanner(socket.getInputStream());
	PrintWriter out = new PrintWriter(socket.getOutputStream());
	// leggo e scrivo nella connessione finche' non ricevo "quit"
	String line = in.nextLine();
	String line1= in.nextLine();
	String out1 = arrayus.Find(line,line1);
	if (out1 == "true" ){
		login= true;
		out.println(login);
	    String line2 = in.nextLine();
	 if(line2=="partita"){ out2 = Numeri.getStringNumbers();
	 out.println(out2);
	 String line3 = in.nextLine();
	  if (line3 == out2) {giusto = true;
	                      out.println(giusto);}
	  }
	 if (line2=="record"){//non c ho sbatti di farlo ma so che ci penserà sicuramente jack
	 }

	 }
	out.flush();
	
	// chiudo gli stream e il socket
	System.out.println("Closing sockets");
	in.close();
	out.close();
	socket.close();
	serverSocket.close();
  }}
