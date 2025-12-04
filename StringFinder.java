public class StringFinder {
    public static void main(String[] args) {
        String pattern;
        String filePath;

       if (args.length == 3 && "search".equals(args[0])) {
            pattern = args[1];
            filePath = args[2];
        } else {
            System.err.println("Wrong input, write: search <pattern> <file>");
            return;
        }

        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(pattern)) {
                    System.out.println(line);
                }
            }
        } catch (java.io.FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (java.io.IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
