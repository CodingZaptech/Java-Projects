// import the necessary packages for establishing the network
import java.net.*;
import java.io.*;


// create the server
public class Server {
    public static void main(String[] args) throws IOException{
        // create the Server Socket
        // we are using port number 8080
        int port = 8080;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server is listening on port " + port);


        // the server is waiting for the client connection

        while(true){
            // we will accept the client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connection successful");


            // reading data transmitted by the client
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            String clientMessage = in.readLine();
            System.out.println("Received message is: " + clientMessage);


            // send response to client
            out.println("Hello from server! You said: " + clientMessage);


            // close client socket
            socket.close();
            // close server socket
            serverSocket.close();
        }
    }
}


