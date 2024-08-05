package randomNumbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; 
public class RandomNumbers { 
	
	int start = 0; 
	int end = 500;
    int counter = 500;
	int numbers [];
	int smallestNumber;
  
    public static void main(String[] args) {
    	
    	RandomNumbers rdn= new RandomNumbers();
    	rdn.generateRandomNumbers();
    	
    }
    public void  generateRandomNumbers() {
    	 numbers = new int[counter]; // create an array to store random numbers
         Random random = new Random(); 

         for( int i=1;i<counter;i++) {

             numbers[i] = random.nextInt(start, end);// this code will generate random numbers

         }
      
         System.out.println("Random numbers: " + Arrays.toString(numbers) + "\n");
         findNthSmallestNumber();
    	
    }
    public  int findNthSmallestNumber(){
    	 Arrays.sort(numbers); // sort the random numbers to select the smallest nth among them
    	 
    	 System.out.println("Sorted Random numbers: " + Arrays.toString(numbers) + "\n");
			
			  System.out.println("User Please Provide the value N"); 
			  Scanner scan = new Scanner(System.in); 
			  int N = scan.nextInt(); // taking the input value of N from user 
			 
     	 smallestNumber = numbers[N-1]; // this will store the nth smallest number 
         System.out.println("the "+ N+"th smallest number is equal: "+ smallestNumber);
         scan.close();
        return smallestNumber;
    } 
   
  
 }
 

