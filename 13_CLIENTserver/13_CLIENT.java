/*
Aim of the Program:
-------------------
To implement a simple Client program using Java Socket programming.
The client connects to the server, sends a message, and receives a response.
*/

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server on localhost at port 5000
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            // Setup input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send message to server
            out.println("Hello Server");

            // Read reply from server
            String serverMessage = in.readLine();
            System.out.println("Server says: " + serverMessage);

            // Close connection
            socket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Simulated Output (Client):
--------------------------
Connected to server!
Server says: Hello Client, I received your message!
*/
