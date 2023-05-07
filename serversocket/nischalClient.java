package serversocket;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class nischalClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket client = new Socket("192.168.30.88", 8000);
            String input;
            while (true) {
                DataInputStream dis = new DataInputStream(client.getInputStream());
                input = dis.readUTF();
                System.out.println("message from server: "+input);
                System.out.println("write your message:");
                String output = sc.nextLine();
                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                dos.writeUTF(output);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
