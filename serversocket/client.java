package serversocket;
import java.net.*;
import java.io.*;
public class client {
    public static void main(String[] args) {
        try{
            Socket client =new Socket ("192.168.43.212",8000);
            String input;
            String output ="hello Nischal Server vai";
            DataInputStream dis =new DataInputStream(client.getInputStream());
            input =dis.readUTF();
            System.out.println("Data from Server "+input);
            DataOutputStream dos =new DataOutputStream(client.getOutputStream());
            dos.writeUTF(output);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
}
