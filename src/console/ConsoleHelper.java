package console;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleHelper {

    public String readMessage(){
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
        return line;
    }
    public void writeMessage(String message){
        System.out.println(message);
    }
    public void nonStaticMethod(){
        System.out.println("non static method called");
    }
    private ConsoleHelper(){}
    private static ConsoleHelper instance = new ConsoleHelper();
    public static ConsoleHelper getInstance(){
        return instance;
    }

}
