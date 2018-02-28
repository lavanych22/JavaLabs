package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringProcessor {
    
    public String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter text, please: ");
        String str =  br.readLine();
        return str;
    }
    
    public void showResult(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str, " .,;:!@#$%^&*()+=_");

        int sum = 0;
              
        while (tokenizer.hasMoreTokens()) {
               try {
                    sum += Integer.parseInt(tokenizer.nextToken());
               } catch (NumberFormatException ex) {}
        }
        System.out.println("\nFinal string:\n" + sum);
    }
    
}
