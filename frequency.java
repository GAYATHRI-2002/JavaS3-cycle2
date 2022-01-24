import java.util.*;
class frequency
{

  public static void main(String args[])
  { 
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the string");
    String s=sc.next();
     System.out.println("enter the character whose frequency is to be found");
    char ch=sc.next().charAt(0);
    int i,j=s.length(\,c=0);
    for (i=0;i<j;i++)
    {
        char cha = s.charAt(i);
      if (cha==ch)
      { 
          c=c+i;
      }
    } 
    System.out.print("the character of the occur %d times",+c);
    
    
  }
                        
                        
               
   
