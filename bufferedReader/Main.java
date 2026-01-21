package bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number");

        InputStreamReader in = new InputStreamReader(System.in); //take the input as stream
        BufferedReader br = new BufferedReader(in); //register that into a buffered reader

        int num = Integer.parseInt(br.readLine()); //read from the buffered reader for int we are coverting the string to int.
        System.out.println(num);

        br.close(); //close the buffered reader.

        //u might have heard about the scanner class to take user inputs , yea that we can use it , but optimal way is what i explained.
    }
}
