import java.io.*;
import java.net.*;

public class Server {
    
    private ServerSocket server = null;

    public Server(int port) {

        try {
            server = new ServerSocket(port);
            System.out.println("Server is open");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        
        Server se = new Server(8000);
                
        System.out.println();
        
        try {
            
        
            while(true) {
                Socket client = se.server.accept();
                new Thread(() -> {

                    try{
                    BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    String line = in.readLine();
                    PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                    

                    while (!line.equals("0")) {
                        System.out.println(line);
                        line = in.readLine();
                    }

                    client.close();
                } catch (IOException e) {}
                }).start();  
            }
            
        } catch (IOException e) {
            
        }
    }

    
}