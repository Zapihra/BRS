import java.io.*;
import java.net.*;

public class Server {
    
    private ServerSocket server = null;

    public Server(int port) {

        try {
            server = new ServerSocket(port);
            System.out.println("Server is open");

        } catch (IOException e) {
        }
    }


    public static void main(String[] args) {
        
        Server se = new Server(8000);
        
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
                        switch (line) {
                            case "1":
                                break;
                            case "2":
                                break;
                            case "3":
                                Instance instance = Instance.startReservation();
                                
                                Instance instance1 = Instance.startReservation();
                                
                                System.out.println(instance + " " + instance1);
                                
                                break;
                            default:
                                break;
                        }
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