package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ManipulateFile {

    public static void main(String[] args) {

        File readFile = new File("");
        File writeFile = new File("");

        manipulateFile(readFile, writeFile);

    }

    public static void manipulateFile(File readFile, File writeFile) {

        try {
            InputStream in = new FileInputStream(readFile);
            OutputStream out = new FileOutputStream(writeFile);

            int len;
            byte[] buf = new byte[1024];

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            out.close();
            in.close();
            readFile.delete();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
