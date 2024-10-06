import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    //variable = (condition) ? expressionTrue :  expressionFalse;

    static void printBooks() {
        System.out.println("Books");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books Book = new Books();
        ArrayList<String> options = new ArrayList<String>();
        int i = 1;

        options.add("0) Exit");
        options.add("1) Find a book");
        options.add("2) Add a book");
        options.add("3) Reserve a book");

        

        while (i > 0) {
            System.out.println(options.get(1) +"\n"+ options.get(2) +"\n"+ options.get(3) +"\n"+ options.get(0));
            i = sc.nextInt();
            System.out.println("You chose to " + options.get(i));
            switch(i) {
                case 1:
                    System.out.println(Book.getBook());
                break;
                case 2:

                break;
                case 3:

                break;
                default:
                break;
            }
        }

        sc.close();
    }
    
}