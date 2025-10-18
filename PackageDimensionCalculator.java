import java.util.Scanner;

public class PackageDimensionCalculator {
    
    // Method to calculate package dimensions
    public static double[] calculatePackageDimensions(double length, double width, double height) {
        // Add 2 inches padding to each dimension for safety
        double PADDING = 2.0;
        
        double packageLength = length + PADDING;
        double packageWidth = width + PADDING;
        double packageHeight = height + PADDING;
        
        return new double[]{packageLength, packageWidth, packageHeight};
    }
    

// My name is ali hyder and i am a very good boy 




    // Method to calculate package volume
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Package Dimension Calculator ===\n");
        
        // Get item dimensions from user
        System.out.print("Enter item length (inches): ");
        double itemLength = scanner.nextDouble();
        
        System.out.print("Enter item width (inches): ");
        double itemWidth = scanner.nextDouble();
        
        System.out.print("Enter item height (inches): ");
        double itemHeight = scanner.nextDouble();
        
        // Calculate package dimensions
        double[] packageDims = calculatePackageDimensions(itemLength, itemWidth, itemHeight);
        
        // Calculate volumes
        double itemVolume = calculateVolume(itemLength, itemWidth, itemHeight);
        double packageVolume = calculateVolume(packageDims[0], packageDims[1], packageDims[2]);
        
        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Item Dimensions: " + itemLength + " x " + itemWidth + " x " + itemHeight + " inches");
        System.out.println("Recommended Package Dimensions: " + packageDims[0] + " x " + packageDims[1] + " x " + packageDims[2] + " inches");
        System.out.println("Item Volume: " + itemVolume + " cubic inches");
        System.out.println("Package Volume: " + packageVolume + " cubic inches");
        System.out.println("Extra Space: " + (packageVolume - itemVolume) + " cubic inches");
        
        scanner.close();
    }
}

public static boolean validateInput(double value) {
    return value > 0;
}
public static boolean isValidDimension(double value) {
    return value > 0;
}