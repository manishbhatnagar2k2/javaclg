import java.io.FileReader;
import java.io.FileWriter;
public class FileIO {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("E:\\test.txt");
            FileWriter fw = new FileWriter("E:\\test2.txt");
            int c;
            while((c = fr.read()) != -1) {
System.out.print((char)c);
                fw.write(c);
            }
System.out.println("  File written ");
            fr.close();
            fw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}