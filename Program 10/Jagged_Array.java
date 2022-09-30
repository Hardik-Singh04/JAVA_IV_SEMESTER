/*Create a jagged array having three rows. Where 1st row contains 
3 columns, 2nd row contains 4 columns and 3rd row contains 2 columns. Insert and 
traverse it*/
import java.util.*;
public class JaggedArray
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,m;
System.out.print("Enter the number of rows in an array : ");
n=in.nextInt();
int arr[][]=new int[n][];
for(int i=0;i<arr.length;i++){
System.out.print("Enter the number of columns in row 
"+(i+1)+" :");
m=in.nextInt();
arr[i]=new int[m];
System.out.print("Enter "+m+" elements in row 
"+(i+1)+" :");
for(int j=0;j<arr[i].length;j++){
arr[i][j]=in.nextInt();
}
}
System.out.println("The array is : ");
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}

