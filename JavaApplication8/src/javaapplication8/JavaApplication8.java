
 
package javaapplication8;
import java.util.Scanner;


public class JavaApplication8 {

  
     
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
      String[][]xo_array=new String[3][3];
      for(int i=0;i<3;i++)
          for(int j=0;j<3;j++)
          {  xo_array[i][j]="   ";}
        
        
         array_print ( xo_array);
       
  int y=0,p=0;
    
for(int i=0;i<3;i++)
{
    
    for(int j=0;j<3;j++){
    if(((i==0||i==1)&&(j==0||j==2))||(i==1&&j==1)){ 
        { 
            do {System.out.println("Enter a row(0,1 or 2)for player x (in empty place )");
     y=input.nextInt();
     System.out.println("Enter a column(0,1 or 2)for player x(in empty place )");
     p=input.nextInt();}
            while(xo_array[y][p]==" x "||xo_array[y][p]==" o ");
       xo_array[y][p]=" x ";     
    array_print ( xo_array);
    winner(xo_array); 
        }
    } else{
            do{ System.out.println("Enter a row(0,1 or 2)for player o");
     y=input.nextInt();
     System.out.println("Enter a column(0,1 or 2)for player o");
     p=input.nextInt();}
      while(xo_array[y][p]==" x "||xo_array[y][p]==" o ");
       xo_array[y][p]=" o ";     
    array_print ( xo_array);
    winner(xo_array);   
                }
        
    
    
    
    }
if(i==3)no_winner(xo_array);


}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
public static void array_print (String xo_array[][]){
  for(int i=0;i<3;i++)
        {  System.out.print("|"); 
         for (int j=0;j<3;j++)
        {System.out.print(xo_array[i][j]+"|");}
        System.out.println("");
        }}


public static void winner (String xo_array[][]){
if((xo_array[0][0]==" x "&&xo_array[0][1]==" x "&&xo_array[0][2]==" x ")||(xo_array[1][0]==" x "&&xo_array[1][1]==" x "&&xo_array[1][2]==" x ")||(xo_array[2][0]==" x "&&xo_array[2][1]==" x "&&xo_array[2][2]==" x ")||(xo_array[0][0]==" x "&&xo_array[2][0]==" x "&&xo_array[1][0]==" x ")||(xo_array[0][1]==" x "&&xo_array[1][1]==" x "&&xo_array[2][1]==" x ")||(xo_array[0][2]==" x "&&xo_array[1][2]==" x "&&xo_array[2][2]==" x ")||(xo_array[0][0]==" x "&&xo_array[1][1]==" x "&&xo_array[2][2]==" x ")||(xo_array[0][2]==" x "&&xo_array[1][1]==" x "&&xo_array[2][0]==" x "))  
{System.out.println("x player won");}

if((xo_array[0][0]==" o "&&xo_array[0][1]==" o "&&xo_array[0][2]==" o ")||(xo_array[1][0]==" o "&&xo_array[1][1]==" o "&&xo_array[1][2]==" o ")||(xo_array[2][0]==" o "&&xo_array[2][1]==" o "&&xo_array[2][2]==" o ")||(xo_array[0][0]==" o "&&xo_array[2][0]==" o "&&xo_array[1][0]==" o ")||(xo_array[0][1]==" o "&&xo_array[1][1]==" o "&&xo_array[2][1]==" o ")||(xo_array[0][2]==" o "&&xo_array[1][2]==" o "&&xo_array[2][2]==" o ")||(xo_array[0][0]==" o "&&xo_array[1][1]==" o "&&xo_array[2][2]==" o ")||(xo_array[0][2]==" o "&&xo_array[1][1]==" o "&&xo_array[2][0]==" o "))  
  {System.out.println("o player won");}  

}

public static void no_winner (String xo_array[][]){
    if((xo_array[0][0]!=" x "&&xo_array[0][1]!=" x "&&xo_array[0][2]!=" x ")||(xo_array[1][0]!=" x "&&xo_array[1][1]!=" x "&&xo_array[1][2]!=" x ")||(xo_array[2][0]!=" x "&&xo_array[2][1]!=" x "&&xo_array[2][2]!=" x ")||(xo_array[0][0]!=" x "&&xo_array[2][0]!=" x "&&xo_array[1][0]!=" x ")||(xo_array[0][1]!=" x "&&xo_array[1][1]!=" x "&&xo_array[2][1]!=" x ")||(xo_array[0][2]!=" x "&&xo_array[1][2]!=" x "&&xo_array[2][2]!=" x ")||(xo_array[0][0]!=" x "&&xo_array[1][1]!=" x "&&xo_array[2][2]!=" x ")||(xo_array[0][2]!=" x "&&xo_array[1][1]!=" x "&&xo_array[2][0]!=" x ")||(xo_array[0][0]!=" o "&&xo_array[0][1]!=" o "&&xo_array[0][2]!=" o ")||(xo_array[1][0]!=" o "&&xo_array[1][1]!=" o "&&xo_array[1][2]!=" o ")||(xo_array[2][0]!=" o "&&xo_array[2][1]!=" o "&&xo_array[2][2]!=" o ")||(xo_array[0][0]!=" o "&&xo_array[2][0]!=" o "&&xo_array[1][0]!=" o ")||(xo_array[0][1]!=" o "&&xo_array[1][1]!=" o "&&xo_array[2][1]!=" o ")||(xo_array[0][2]!=" o "&&xo_array[1][2]!=" o "&&xo_array[2][2]!=" o ")||(xo_array[0][0]!=" o "&&xo_array[1][1]!=" o "&&xo_array[2][2]!=" o ")||(xo_array[0][2]!=" o "&&xo_array[1][1]!=" o "&&xo_array[2][0]!=" o "))    
    {System.out.println("No winner");}

}



}
