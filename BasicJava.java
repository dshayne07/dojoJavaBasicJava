import java.util.ArrayList; // lets us use arraylists
public class BasicJava{
    public static void main(String[] args){
        // Print 1-255
        // Write a method that prints all the numbers from 1 to 255.
        // printAllNums();

        // Print odd numbers between 1-255
        // Write a method that prints all the odd numbers from 1 to 255.
        // printOddNums();

        // Print Sum
        // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. For example, your output should be something like this:
        // New number: 0 Sum: 0
        // New number: 1 Sum: 1
        // New number: 2 Sum: 3
        // New number: 3 Sum: 6
        // ...
        // New number: 255 Sum: ___
        // Do NOT use an array to do this exercise.
        // printSum();

        // Iterating through an array
        // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
        // int[] x = {1,3,5,7,9,13};
        // iterateArray(x);

        // Find Max
        // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
        // int[] x = {1,3,5,7,9,13};
        // findMax(x);

        // Get Average
        // Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
        // int[] x = {2, 10, 3};
        // getAverage(x);

        // Array with Odd Numbers
        // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
        // oddArray();

        // Greater Than Y
        // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
        // int[] x = {1, 3, 5, 7};
        // int y = 3;
        // greaterThanY(x, y);
        
        // Square the values
        // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
        // double[] x = {1, 5, 10, -2};
        // squareValues(x);

        // Eliminate Negative Numbers
        // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
        // int[] x = {1, 5, 10, -2};
        // elimNegative(x);

        // Max, Min, and Average
        // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
        // int[] x = {1, 5, 10, -2};
        // int[] y = minMaxAvg(x);
        
        // Shifting the Values in the Array
        // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
        // int[] x = {1, 5, 10, 7, -2};
        // int[] y = shiftValues(x);

    }
    public static void printAllNums(){
        for(int i=0; i<=255; i++){
            System.out.println(i);
        }
    }
    public static void printOddNums(){
        for(int i=1; i<=255; i+=2){
            System.out.println(i);
        }
    }
    public static void printSum(){
        int sum=0;
        for(int i=0; i<=255; i++){
            sum+=i;
            System.out.println("New number: "+i+" Sum: "+sum);
        }
    }
    public static void iterateArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void findMax(int[] array){
        int max=array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
    public static void getAverage(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        int average = sum / array.length;
        System.out.println(average);
    }
    public static void oddArray(){
        ArrayList<Integer> oddArrayList = new ArrayList<Integer>();
        for(int i=1; i<=255; i+=2){
            oddArrayList.add(i);
        }
    }
    public static void greaterThanY(int[] array, int num){
        int counter = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > num){
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void squareValues(double[] array){
        for(int i=0; i<array.length; i++){
            array[i] = Math.pow(array[i], 2);
        }
    }
    public static void elimNegative(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i] < 0){
                array[i] = 0;
            }
        }
    }
    public static int[] minMaxAvg(int[] array){
        int sum=0;
        int min=array[0];
        int max=array[0];
        for(int i=0; i<array.length; i++){
            sum+=array[i];
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        int average = sum / array.length;
        int[] result = {max, min, average};
        return result;
    }
    public static int[] shiftValues(int[] array){
        for(int i=0; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        return array;
    }
}
