class ABC  
{    
int x = 30;  
}  
public class ShallowCopyExample2   
{      
public static void main(String args[])   
{   
ABC obj1 = new ABC();  
ABC obj2 = obj1;   
obj2.x = 6;          
ABC obj3 = new ABC();    
ABC obj4 = new ABC();   
obj4.x = 6;    
System.out.println("The value of x is: " + obj1.x); 
System.out.println("The value of x is: " + obj3.x);
System.out.println("The value of x is: " + obj4.x);
}    
}   