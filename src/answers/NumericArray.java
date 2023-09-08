package answers;

public class NumericArray {

    /*
    Given the numeric arrays
    Search for numbers that are multiple of 3
     */
    public static void main(String[] args) {

        //Initialize the known values
        int[] arrayExample = {4, 8, 15, 16, 23, 42};

        //Make decision-Output
        System.out.println("Numbers multiple of 3:");
        for (int j : arrayExample) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }
}
