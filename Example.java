public class Example {
    private final static double PI = 3.141;

    public static void main(String[] args) {
        // Declear double called "myNumber"
        double myNumber;

        /**
         * Assignment statement
         * Assigns 45 to "myNumber"
        */
        myNumber = 45.0;

        // Print number in degrees
        System.out.println("Degrees: " + myNumber);

        // Stores the number converted to radians
        double myNumberInRad;

        /**
         * Assignment expression Convert number from degrees to radians
        */
        myNumberInRad = toRad(myNumber);

        // Print number in degrees
        System.out.println("Radians with method call: " + myNumberInRad);

        /**
         * Same as before just without method call
        */
        myNumberInRad = myNumber * PI / 180.0;

        // Print number in degrees
        System.out.println("Radians without method call: " + myNumberInRad);
    }

    /**
     * @Test Converts degrees to radians.
     * @param deg type double refers to degrees
     */
    private static double toRad(double deg) {
        return deg * PI / 180.0;
    }
}
