import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        //declare variables
        int ARRAY_LEN = 100; //var to change length of array
        Random rnd = new Random();
        //Section 1A____________________________________________________________________________________________________
        int dataPoints[] = new int[ARRAY_LEN]; //declare array dataPoints

        //Section 1B____________________________________________________________________________________________________
        for(int i = 0; i < ARRAY_LEN; i++){
            dataPoints[i] = rnd.nextInt(100)+1; //sets each value to a random number
        }

        //Section 1C____________________________________________________________________________________________________
        for(int i = 0; i < ARRAY_LEN; i++){
            System.out.print(dataPoints[i] + " | "); //prints each value of datapoints
        }

        //Section 1D____________________________________________________________________________________________________
        int sum= 0;
        for(int i = 0; i < ARRAY_LEN; i++){
            sum += dataPoints[i]; //adds every value of datapoints
        }
        System.out.println("\nThe sum of the random array dataPoints is: " + sum); //prints sum
        System.out.print("The average of the random array dataPoints is: " + sum/ARRAY_LEN); //prints integer average

        //Section 2A____________________________________________________________________________________________________
        Scanner input = new Scanner(System.in);
        int retInt = SafeInput.getRangedInt(input, "Enter an integer value between 1 and 100. The program will find how many times your number occurs in the array", 1, 100); //uses safeInput library to get input from user

        //Section 2B____________________________________________________________________________________________________
        int counter=0;
        for(int i = 0; i < ARRAY_LEN; i++){
            if(dataPoints[i] == retInt){
                counter++; //counts every occurrence of input from user
            }
        }
        System.out.println("The value " + retInt + " was found in the array dataPoints " + counter + " times");

        //Section 2C____________________________________________________________________________________________________
        int retInt2 = SafeInput.getRangedInt(input, "Enter an integer value between 1 and 100. The program will find the first occurrence of the number in the array", 1, 100); //uses safeInput library to get input from user
        boolean isFound = false;
        for(int i = 0; i < ARRAY_LEN; i++){
            if(dataPoints[i] == retInt2){
                System.out.println("The first occurrence of " + retInt2 + " in the array dataPoints is at index " + i); //outputs the first occurrence
                isFound = true;
                break; //stops loop
            }
        }

        if(!isFound){ //if integer was not found
            System.out.println("The integer you entered was not found in the array dataPoints");
        }

        //Section 2D____________________________________________________________________________________________________
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int i = 0; i < ARRAY_LEN; i++){
            if(dataPoints[i] < min){ //checks if any int is less than current value in min
                min = dataPoints[i];
            }
            if(dataPoints[i] > max){ //checks if any int is more than current value in max
                max = dataPoints[i];
            }
        }
        System.out.println();
        System.out.println("The minimum value in the array dataPoints is " + min);
        System.out.println("The maximum value in the array dataPoints is " + max);

        //Section 2E____________________________________________________________________________________________________
        System.out.println("The average of dataPoints is " + getAverage(dataPoints));

        //Extra Credit Values
        //uses the extraCreditValues library and prints the output here
        System.out.println("\n EXTRA CREDIT:");
        System.out.println("The min of datapoints is " + ExtraCreditLibrary.min(dataPoints));
        System.out.println("The amx of datapoints is " + ExtraCreditLibrary.max(dataPoints));
        int target = SafeInput.getRangedInt(input, "Enter an integer value between 1 and 100. The program will find how many times your number occurs in the array", 1, 100);

        System.out.println("The value " + target +" is found " + ExtraCreditLibrary.occurrenceScan(dataPoints, target) + " times");
        System.out.println("The sum of the values in dataPoints is " + ExtraCreditLibrary.sum(dataPoints));
        int target1 = SafeInput.getRangedInt(input, "Enter an integer value between 1 and 100. The program will find if the value is contained in the array", 1, 100);
        if(ExtraCreditLibrary.contains(dataPoints, target1)) {
            System.out.println("The value " + target1 + " is located in the array datapoints");
        } else {
            System.out.println(target1 + " was not found in the array datapoints");
        }
    }

    //Method uses in 2E to get double average
    public static double getAverage(int values[]){
        double avgCounter = 0.0;
        for(int i = 0; i < values.length; i++){
            avgCounter += values[i];
        }
        return avgCounter/values.length;
    }
}