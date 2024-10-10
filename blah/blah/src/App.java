import java.util.Scanner;
import java.io.File; //have to import in order to pull from a file
import java.io.FileNotFoundException;

public class App { //open the destnation
    public static void main(String[] args) throws FileNotFoundException {
        //String word = "hello world";
        //System.out.println(blahconverter(word));
        Scanner fileinput = new Scanner(new File("Testing.txt"));

        while(fileinput.hasNext()) {
            String word = fileinput.next();
            word = blahconverter(word);
            System.out.print(word + " ");
        }


        fileinput.close();
    }

    public static String blahconverter(String input) {
        String output = "";
        for( int i = 0; i < input.length(); i++) {
            if(i%3 == 0)
            output+="b";
            if(i%3 == 1)
            output+="l";
            if(i%3 == 2)
            output+="a";
        }

        return output;
    }


}