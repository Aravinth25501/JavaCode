public class classs {

    public static void main(String[] args) {
        int radius = 7;

        double diameter = 2.0 * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double circumfrence = 2.0 * Math.PI * radius;

        System.out.println("Diameter : " + formatNumber(diameter));
        System.out.println("Area : " + formatNumber(area));
        System.out.println("Circumference : " + formatNumber(circumfrence));
    }

    private static String formatNumber(double value) {
        int intValue = (int) value;
        double decimalPart = value - intValue;
        
        if (decimalPart >= 0.5 / 1e6) {
            intValue += 1;
        }
        
        return String.format("%d.%06d", intValue, 0);
    }
}
