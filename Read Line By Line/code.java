/*Write a program that reads from a text file line by line and 
writes on console.*/
import java.io.*;
public class ReadLineByLine
{
public static void main(String args[]) throws IOException
{
FileReader fr=new FileReader("file1.txt");
BufferedReader br=new BufferedReader(fr);
String s;
int i=1;
while((s=br.readLine())!=null)
{
System.out.println("Line "+i+" : "+s);
i++;
}
br.close();
fr.close();
}
}
