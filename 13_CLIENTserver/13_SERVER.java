/*
Aim of the Program:
-------------------
To implement a simple Server program using Java Socket programming.
The server waits for a client, receives a message, and sends back a response.
*/

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create server socket at port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Setup input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read message from client
            String clientMessage = in.readLine();
            System.out.println("Client says: " + clientMessage);

            // Send reply to client
            out.println("Hello Client, I received your message!");

            // Close resources
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Simulated Output (Server):
--------------------------
Server started. Waiting for client...
Client connected!
Client says: Hello Server
*/
