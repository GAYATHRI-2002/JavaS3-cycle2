import java.util.*;  
 class Trace  
{  
    public static void main(String args[])  
    {  
        int array[][] = new int[5][5];  
        int i, j;  
        double sum = 0, square = 0, result = 0;  
    Scanner s = new Scanner(System.in);  
     System.out.print("Enter the number of rows: ");    
    int row = s.nextInt();  
     System.out.print("Enter the number of columns: ");  
    int column = s.nextInt();  
    System.out.println("Enter matrix:");  
   
        for(i = 0; i < row; i++)  
     { 
        for(j = 0; j < column; j++)   
            {  
                array[i][j] = s.nextInt();   
                System.out.print(" ");  
            }  
        }  
    System.out.println("You have entered the following matrix: ");  
    
    for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < column; j++)  
            {  
            System.out.print(array[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
        System.out.println("The trace of the given matrix is: ");  
    for(i = 0; i < row; i++)  
    {    
            for(j = 0; j < column; j++)  
            {  
                if(i == j)  
                 { 
                     sum = sum + (array[i][j]);  
                }  
            }  
        }  
        System.out.println(sum);    
        System.out.println("The normal of the given matrix is: ");   
          
    for(i = 0; i < row; i++)  
    {  
            for(j = 0; j < column; j++)  
            {  
                square = square + (array[i][j])*(array[i][j]);  
            }  
        
        result = Math.sqrt(square); 
      System.out.println(result);  
    }  
}  
