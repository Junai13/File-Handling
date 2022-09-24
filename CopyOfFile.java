package filereaderprogram;

import java.io.*;

public class CopyOfFile {
    public void copyFile(){
        try {
            InputStream ip = new FileInputStream("F:\\File Reader\\src\\filereaderprogram\\Main.java");
            OutputStream op = new FileOutputStream("E:\\CopyJava");
            int content = ip.read();
            while(content != -1){
                op.write(content);
                content = ip.read();
            }
            op.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
