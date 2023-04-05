package demo;  
import java.io.*;  
public class Demo {  
 void first() throws IOException {  
  throw new IOException("error");  
 }  
 void second() throws IOException {  
  first();  
 }  
 void third() {  
  try {  
   second();  
  } catch (Exception e) {  
   System.out.println("work is done");  
  }  
 }  
 public static void main(String[] args) {  
  Demo obj = new Demo();  
  obj.third();  
  System.out.println("all in control");  
 }  
}