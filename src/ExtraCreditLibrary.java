public class ExtraCreditLibrary {
    /**
     * @param values is an integer array of n length
     * @return the minimum value in the array values
     */
    public static int min(int values[]){
        int min = values[0];
        for(int i = 0; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
            }
        }
        return min;
    }

    /**
     * @param values is an integer array of n length
     * @return the maximum value in the array values
     */
    public static int max(int values[]){
        int max = values[0];
        for(int i = 0; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    /**
     * @param values is an integer array of n length
     * @param target is the value which we want to find the occurrences of
     * @return the number of times target is found in the values array
     */
    public static int occurrenceScan(int values[], int target){
        int counter=0;
        for(int i = 0; i < values.length; i++){
            if(values[i] == target){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param values is an integer array of n length
     * @return the sum of the values of the array
     */
    public static int sum(int values[]){
        int sum =0;
        for(int i = 0; i < values.length; i++){

            sum += values[i];
        }
        return sum;
    }

    /**
     * @param values is an integer array of n length
     * @param target is the value we want to find in the array
     * @return boolean value if the target value was found in the array values
     */
    public static boolean contains(int values[], int target){
        boolean isFound = false;
        for(int i = 0; i < values.length; i++){
            if(values[i] == target){
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
