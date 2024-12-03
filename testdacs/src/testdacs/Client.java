package testdacs;
import java.io.*;
import java.net.*;

public class Client {
	    public static void main(String[] args) {
	        String serverAddress = "localhost";  
	        int port = 12345;  

	        try {
	            Socket socket = new Socket(serverAddress, port);
	            System.out.println("Connecté au serveur!");

	            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

	            output.println("Hello, serveur!");

	            output.close();
	            socket.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
