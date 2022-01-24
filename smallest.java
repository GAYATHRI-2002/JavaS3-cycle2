import java.util.*;
class sumarray
{    Public static void main(String args[])
 {
       Sanner s = new Scanner(System.in);
  int i ,n,small;
  System.out.println("enter the array elements:");
  n=s.nextInt();
  int[]a=nwInt[n];
  System.out.println("enter the elements");
  for(i=0;i<n;i++)
  {a[i]=s.nextInt();
  }
  small=a[0];
  for (i=1;i<n;i++)
  {
   if (a[i]<small)
   {
      small=a[i];
   }
    System.out.println("smallest of "+n+" element in  an  array +"+small);
  }
}
