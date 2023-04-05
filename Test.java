import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Test 
{
    public static void main(String ... args) 
     {
        try {
            FileInputStream fis = new FileInputStream("E:\\javaclg\\test.txt");
            FileOutputStream fos = new FileOutputStream("E:\\javaclg\\test.txt");
            int i=0;
            while((i=fis.read())!=-1)
            {
                fos.write(i);
                fis.close();
        
            }
fos close();
            System.out.println("Write Successfully");
        } catch (Exception e) 
        {
            System.out.println(e);
        }        
        
    }
}