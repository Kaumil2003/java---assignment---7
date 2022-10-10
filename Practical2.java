import java.io.*;

public class Practical2 {
    public static void main(String[] args)
            throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("C:/Users/Dell/Desktop/java/self/testFile1.txt");

            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
            System.out.print("Program successfully executed");
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}

