/* 7 - Apply following functions on StringBuffer object "HELLO"
(i) Append "Java"
(ii) Insert "Java" at index 1
(iii) Replace with "Java" with characters between index 1 to 2
(iv) Delete characters between index 1 and 2 
(v) Reverse the string "HELLO"*/

import java.util.*;
public class StringBuff
{
public static void main(String args[])
{
 StringBuffer s=new StringBuffer("HELLO ");
 StringBuffer s1=new StringBuffer("HELLO");
 
 //(i) Append "Java"
s.append("Java"); //HELLO Java
 System.out.println(“1.String after appending Java : ”+s);
 
 //(ii) Insert "Java" at index 1
s.insert(1,"Java"); //HJavaELLO Java
System.out.println(“2.String after inserting Java at 1 index :”+s);
 
 //(iii) Replace with "Java" with characters between index 1 to 2
 s.replace(1,2,"Java"); //HJavaavaELLO Java
 System.out.println(“3.Relacing java with characters b/w index 1-
2 ”+s); 
 //(iv) Delete characters between index 1 and 2 
 s.delete(1,2); //HavaavaELLO Java
 System.out.println(“4.Deleting characters b/w 1-2”+s);
 
 //(v) Reverse the string "HELLO"
 s1.reverse(); //OLLEH
System.out.println(“5.Reversing HELLO”+s1);
}
}
