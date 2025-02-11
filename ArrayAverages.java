import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int sum = 0;

    for(int row = 0; row<ray.length; row++)
    {
     for(int col = 0; col<ray[row].length; col++)
     {
       sum += ray[row][col];
     }
     System.out.println("The average of row " + row + " is: " + (double) sum / ray.length);
     sum = 0;  
    }
    System.out.println("\n");
  }

  public void columnAverages(){
    //Column major order
    //Take each column and go through all of the rows
    //Top down and left to right
    int sum = 0;
    
    for(int col=0; col<ray[0].length;col++)
    {
      for (int row = 0; row < ray.length; row++)
       {
        sum += ray[row][col];
        }
        System.out.println("The average of column " + col + " is: " + (double) sum / ray.length);
        sum=0;
      }
      System.out.println("\n");
    }
  public void arrayAverage(){
    int sum = 0;
    int count =0;
    for (int row = 0; row < ray.length; row++) 
    {
      for (int col = 0; col < ray[row].length; col++) 
      {
          sum += ray[row][col];
          count++;
      }
    }
    System.out.println("The average of this array is: " + (double) sum / count);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return "";
  }
}
