
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array) {
        for(int x = 0 ; x <array.length; x++){ //scans the rows
            for(int y = 0 ; y < array[x].length; y++){ // scans the columns
                System.out.print(array[x][y]);
                if (y < array[x].length -1){
                    System.out.print(", "); //prints the element followed by comma
                }
            }
            System.out.println(); // formats to be in an array
        }
    }


    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array) {
        int total = 0; //helper variable to count total
        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array[x].length; y++) {
                total = total + array[x][y]; //adds all the values together to make total
            }
        }
        return total;
    }


    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static int aSum(int[][] array) {
        int total = 0;
        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array[x].length; y++) {
                total = total + array[x][y];
            }
        }
        return total; //same code as above
    }

    public static double average(int[][] array) {
        int totalElements = array.length * array[0].length;
        return (double) aSum(array) / totalElements;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] array) {
        //int min = array[0][0];  // Start with first element by using helper variable
        int min = 999999999;    // Set a high value to start
        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array[x].length; y++) {
                if (array[x][y] < min) {
                    min = array[x][y];
                }
            }
        }
        return min; //essentially copying the exact same logic from before where we find the minimum
    }


    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array) {
        //int max = array[0][0];  // Start with first element by using helper variable
        int max = 0;
        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array[x].length; y++) {
                if (array[x][y] > max) {
                    max = array[x][y];
                }
            }
        }
        return max; //essentially copying the exact same logic from before where we find the maximum
    }


    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array) {
        int count = 0;
        for (int x = 0; x < array.length; x++) {          // rows
            for (int y = 0; y < array[x].length; y++) {   // columns
                if (array[x][y] % 2 == 0) {               // even check by using mod (anything/2 is even if no remainder
                    count++;                              // having [x][y] is like checking each element one by one
                }
            }
        }
        return count;
    }


    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array) {
        int count = 0;
        for (int[] row : array) {          // Each iteration, row becomes array[0], then array[1], etc.
            for (int value : row) {        // Each iteration, value becomes row[0], row[1], etc. (e.g., array[0][0], array[0][1]).
                if (value % 2 == 0) {      // even check with mod function
                    count++;
                }
            }
        }
        return count;
    }


    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x][y] <= 0) { // if the specific value is negative...
                    return false;  // Found non-positive, return immediately
                }
            }
        }
        return true;  // Same logic as proof with contradiction in extended math.
    }


    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array) {
        int[] sums = new int[array.length];  // 1D array same length as # rows

        for (int x = 0; x < array.length; x++) {
            int rowSum = 0;
            for (int y = 0; y < array[x].length; y++) {
                rowSum = rowSum + array[x][y];
            }
            sums[x] = rowSum;
        }
        return sums;
    }


    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] array) {
        int[] sums = new int[array[0].length];  // 1D array same length as # columns

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                sums[y] += array[x][y];
            }
        }
        return sums;
    }


}
