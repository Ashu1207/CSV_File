import java.io.*;  
import java.util.Scanner;  
public class Product 
{  
public static void main(String[] args) throws Exception  
{  
//parsing a CSV file into Scanner class constructor  
Scanner sc = new Scanner(new File("E:/Product/Product1.csv"));  
sc.useDelimiter(",");   //sets the delimiter pattern  
while (sc.hasNext())  //returns a boolean value  
{  
System.out.print(sc.next());   
}   
sc.close();   
}  
}  