
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) throws IOException{

        ArrayList<String> options = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8000);
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));        

        int i = 1;


        options.add("0) Exit");
        options.add("1) Find a book");
        options.add("2) Add a book");
        options.add("3) Reserve a book");

        if (i != 0){

        }

        while (i > 0) {
            System.out.println(options.get(1) +"\n"+ options.get(2) +"\n"+ options.get(3) +"\n"+ options.get(0));
            i = sc.nextInt();
            System.out.println("You chose to " + options.get(i));
            switch(i) {
                case 1 -> out.println(i);
                case 2 -> {out.println(i);
                }
                case 3 -> {out.println(i);
                }
                default -> {out.println(i);
                }
            }
        }
        socket.close();
        
        
        
        sc.close();
    }
}
