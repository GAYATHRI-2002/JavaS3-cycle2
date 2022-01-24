import java.util.*;
class rteplace
{

  public static void main(String args[])
  { 
     int i,flag=0,c=0;
    Scanner obj=new Scanner (System.in);
    System.out.println("enter the string length");
    int n= obj.nextInt();
    System .out .println("enter the string");
    char a[]=newchar[20];
    for(i=0;i<n;i++)
      a[i]=obj.next()charAt(0);
    System .out .println("enter the position of the caracter to be placed :");
     char ch=obj.next().charAt[0];
    for (i=1;i<=n;i++)
      a[x]=ch;
     System.out .println("replace String is");
    for(i=0;i<=n;i++)
      System.out.println(a[i]);
  }
}
