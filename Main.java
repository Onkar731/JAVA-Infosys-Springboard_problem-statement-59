import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputString = sc.nextLine();

        // extracting values from the input
        int[] heights = Arrays.stream(inputString.split(",")).mapToInt(Integer::parseInt).toArray();
        
        // printing longest mountain sub array length
        System.out.println(MountainPeak.findMountainSubArray(heights,heights.length));

        // closing resoucre
        sc.close();
    }
}