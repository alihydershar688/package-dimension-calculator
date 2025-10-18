import java.util.Scanner;

public class PackageDimensionCalculator {
    
    // Validation method
    public static boolean isValidDimension(double value) {
        return value > 0;
    }
    
    // Method to calculate package dimensions
    public static double[] calculatePackageDimensions(double length, double width, double height) {
        double PADDING = 2.0;
        return new double[]{length + PADDING, width + PADDING, height + PADDING};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Package Dimension Calculator ===\n");
        
        // Get and validate length
        double itemLength;
        do {
            System.out.print("Enter item length (inches): ");
            itemLength = scanner.nextDouble();
            if (!isValidDimension(itemLength)) {
                System.out.println("Error: Length must be positive!");
            }
        } while (!isValidDimension(itemLength));
        
        // Get and validate width
        double itemWidth;
        do {
            System.out.print("Enter item width (inches): ");
            itemWidth = scanner.nextDouble();
            if (!isValidDimension(itemWidth)) {
                System.out.println("Error: Width must be positive!");
            }
        } while (!isValidDimension(itemWidth));
        
        // Get and validate height
        double itemHeight;
        do {
            System.out.print("Enter item height (inches): ");
            itemHeight = scanner.nextDouble();
            if (!isValidDimension(itemHeight)) {
                System.out.println("Error: Height must be positive!");
            }
        } while (!isValidDimension(itemHeight));
        
        double[] packageDims = calculatePackageDimensions(itemLength, itemWidth, itemHeight);
        
        System.out.println("\n--- Results ---");
        System.out.println("Item: " + itemLength + " x " + itemWidth + " x " + itemHeight);
        System.out.println("Package: " + packageDims[0] + " x " + packageDims[1] + " x " + packageDims[2]);
        
        scanner.close();
    }
}