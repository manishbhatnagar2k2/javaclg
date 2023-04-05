import java.io.FileInputStream;
import java.io.FileOutputStream;
public class TestRW {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\javaclg\\input.txt");
            FileOutputStream fos = new FileOutputStream("E:\\javaclg\\test.txt");
            int i=0;
            while((i = fis.read()) != -1) {
                System.out.println((char)i);
                fos.write(i);
            }
            System.out.println("File wrritten successfully");
            fis.close();
            fos.close();
        } catch(Exception e)
         {
            System.out.println(e);
        }
    }
}
