package filereaderprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileRead{
    public void lineCount(BufferedReader afile) throws IOException {
        BufferedReader read = new BufferedReader(afile);
        int line=0, word=0, character = 0;
        String countline = read.readLine();
        while(countline != null) {
            line++;
            String[] words = countline.split(" ");
            word += words.length;
            for (String i : words) {
                character += i.length();
            }
            countline = read.readLine();
        }


        System.out.println("No of lines : " + line);
        System.out.println("No of words : " + word);
        System.out.println("No of characters : " + character);
    }
}
