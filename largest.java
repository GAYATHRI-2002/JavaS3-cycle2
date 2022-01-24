import java.util.*;
class largest
{    Public static void main(String args[])
{
    int row,col,i,j;
 Sanner s = new Scanner(System.in);
   System.out.println("enter number of rows and columns in the matrix");
   int row=s.nextInt();
  int col=s.nextInt();
  int[][]a=newInt[50][50];
  
   System.out.println("enter the matrix elements");
  for (i=0;i<row;i++);
  for (j=0;i<col;j++);
  a[i][j]=s.nextInt();
   int large=a[0][0];
   for (i=0;i<row;i++);
  for (j=0;i<col;j++);
  if(a[i][j]>large)
    large =a[i][j];
  System.out.println("largest number is"+large);
}
}
