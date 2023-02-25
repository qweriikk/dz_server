import dota.Phone;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        try (Phone phone = new Phone("127.0.0.1", 8000)) {
             System.out.println("Connected to server");

             String request = "Visaginas";
             System.out.println("Request: " + request);
             phone.writeLine(request);

             String responce = phone.readLine();
             System.out.println("Request: " + request);

        } catch (IOException e) {
            e.printStackTrace ();

        }
    }
 }
