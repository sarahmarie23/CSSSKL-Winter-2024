/*
 * Why you should use MAX_VALUE and MIN_VALUE to find
 * min and max instead of 0
 * You can also use POSITIVE_INFINITY and NEGATIVE_INFINITY
 * If using ints, use Integer.MAX_VALUE and Integer.MIN_VALUE
 */
public class MinMaxExample {
    public static void main(String[] args) {
        double min = Double.MAX_VALUE; // initialize to Double.MAX_VALEUE;
        double max = Double.MIN_VALUE; // initialize to Double.MIN_VALIUE;
        double[] temps = {10.0, 15.0, 20.0, 18.0, 12.0};
        
        for (double temp : temps) {
            System.out.println("current temp: " + temp);
            System.out.println("current min: " + min);
            System.out.println("current max: " + max);
            
            if (temp < min) { // Check for min
                min = temp;
                System.out.println("new min: " + min);
            }
            if (temp > max) { // Check for max
                max = temp;
                System.out.println("new max: " + max);
            }
            System.out.println();
        }
        System.out.println("Minimum temperature: " + min);
        System.out.println("Maximum temperature: " + max);
    }
}
