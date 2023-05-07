package serversocket;
import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        try{
            ServerSocket server= new ServerSocket(1234);
            Socket client;
            System.out.println("Waiting for client.......");
            client=server.accept();

            while(true){
                String output = "hello";
                DataOutputStream dos =new DataOutputStream(client.getOutputStream());
                dos.writeUTF(output);
                DataInputStream dis =new DataInputStream(client.getInputStream());
                String input =dis.readUTF();
                System.out.println(input);
            }
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
