
import java.io.IOException;
import java.util.Scanner;


public class main {


    public static void main(String[] args)  {

      Scanner sc  = new Scanner(System.in);


      int[][] arr = new int[3][3];

      //Input
      for(int r= 0; r< arr.length; r++){

          for(int c=0; c< arr[r].length; c++){
             arr[r][c] = sc.nextInt();
          }
      }


        //Output
        for(int r= 0; r< arr.length; r++){

            for(int c=0; c< arr[r].length; c++){
                System.out.print(arr[r][c] + " ");
            }

            System.out.println();
        }



    }




        }


