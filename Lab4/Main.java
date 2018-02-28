package lab4;

import java.io.IOException;

public class Main {
 
       public static void main(String[] args) throws IOException {
              StringProcessor stringProcessor = new StringProcessor();
        String finalStr = "";

        try {
            finalStr = stringProcessor.readInputText();
        } catch(IOException e) {
        }
        
        stringProcessor.showResult(finalStr);
       }
}