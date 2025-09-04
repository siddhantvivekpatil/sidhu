

//Q.Take an array as input from the user.Search for a given number x and print the index at which it occurs.



import java.util.*;
public class Array2 {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
         
        for(int i=0;i<size;i++){  //input
        numbers[i] = sc.nextInt();  
        }

        int x = sc.nextInt();

         

        


    
        for(int i=0;i<numbers.length;i++){    //output    (numbers.length = size)
         if(numbers[i]==x){
          System.out.println("index of x:"+i);
        }
    }
}

}