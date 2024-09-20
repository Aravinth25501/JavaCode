public class stringBuffer {
    public static void main(String[] args) {
        // Create a new StringBuilder instance
        StringBuilder sb = new StringBuilder();

        // Append "Hello, " to the StringBuilder
        sb.append("Hello, ");
        
        // Append "world!" to the StringBuilder
        sb.append("world!");
        
        // Insert "awesome " at index 7 in the StringBuilder
        sb.insert(7, "awesome ");
        
        // Delete characters from index 7 (inclusive) to 14 (exclusive) from the StringBuilder
        sb.delete(7, 14);
        
        // Get a substring from index 7 (inclusive) to 14 (exclusive) and store it in 'sub'
        String sub = sb.substring(7, 14);
        
        // Replace characters from index 7 (inclusive) to 14 (exclusive) with "amazing"
        sb.replace(7, 14, "amazing");
        
        // Reverse the characters in the StringBuilder
        sb.reverse();
        
        // Convert the final StringBuilder contents to a String and store it in 'result'
        String result = sb.toString();

        // Print the substring obtained earlier and the final result
        System.out.println(sub);     // Output: awesome
        System.out.println(result);  // Output: gnizama ,olleH
    }
}
