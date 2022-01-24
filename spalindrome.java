import java.util.*;
class spalindrome
{
  
  public static void main(String args[])
  { 
     int i,flag=0,c=0;
    Scanner obj=new Scanner (System.in);
    System.out.println("enter the string length");
    int n= obj.nextInt();
    System .out .printlmn("enter the string");
    char a[]=newchar[20];
    for(i=0;i<n;i++)
      a[i]=obj.next()charAt(0);
    for(i=0;a[i]!='10';i++)
      if (a[i]!=a[n-i-1])
      {flag=1;
       break;
      }
    if (flag=1)
      System.out.println("entered string is not palindrome");
    else
     System.out.println("entered string is palindrome"); 
  }
}
    
    
