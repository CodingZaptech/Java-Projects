// import the necessary packages for establishing the network
import java.net.*;
import java.io.*;


// create the client
public class Client{


    public static void main(String[] args) throws IOException{


        // create a client socket on port 8080
        int port = 8080;
        Socket socket = new Socket("localhost", port);
        // send message to server
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        output.println("Hello Server!");


        // read response from server
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response = input.readLine();


        System.out.println("Server says: " + response);


        // close socket
        socket.close();
    }


}