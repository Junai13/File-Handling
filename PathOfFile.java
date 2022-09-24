package filereaderprogram;

import java.io.File;

public class PathOfFile {
    public void pathoffile(){
        File file = new File("E:\\CopyJava");
        System.out.println(file.getAbsoluteFile());
    }
}
