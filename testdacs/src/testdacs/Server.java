package testdacs;
import java.io.*;
import java.net.*;

public class Server {
	    public static void main(String[] args) {
	        int port = 12345;  

	        try {
	            ServerSocket serverSocket = new ServerSocket(port);
	            System.out.println("Serveur en attente de connexion sur le port " + port);

	            Socket clientSocket = serverSocket.accept();
	            System.out.println("Client connecté!");

	            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

	            String message = input.readLine();
	            System.out.println("Message du client: " + message);

	            input.close();
	            clientSocket.close();
	            serverSocket.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	

}
