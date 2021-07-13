import java.util.*;
public class Pranav_Harshith{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int array[] = new int[n];
        int temp = 0;
        System.out.println("Enter the elements in the array");
        for(int i = 0; i<array.length ; i++) {
        array[i] = sc.nextInt();
        }
      
        for(int i = 0;i < n; i++){
            for(int j = i+1; j < n ; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                
    
                
            }
        }
        System.out.println();
        
        for(int i =0; i<n-1;i++){
            
            if(array[i] < array[i+1]) {
            	
            	System.out.print(array[i] + " < " + " ");
            }
           
            else if(array[i] == array[i+1]) {
            	System.out.print(array[i] + " = " + " ");
            }
            
            
            
        }
        System.out.print(array[n-1]);
        
        
    }
}

