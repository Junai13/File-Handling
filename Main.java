package filereaderprogram;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader("F:\\File Reader\\src\\filereaderprogram\\Main.java"));
        FileRead fr = new FileRead();
        fr.lineCount(read);
        CopyOfFile pathoffile = new CopyOfFile();
        pathoffile.copyFile();
        PathOfFile path = new PathOfFile();
        path.pathoffile();
    }

}
