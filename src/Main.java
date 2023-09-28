import java.io.*;

public class Main {
    public static void main(String[] args) {
      try {
          File file = new File("data.txt");
          String param = "";

          if (args.length > 0) {
              param = args[0];
          } else {
              param = "No arguments provided.";
          }

          String content = "Begin file";

          FileWriter fw = new FileWriter(file, true);
          // Create a BufferedWriter
          BufferedWriter bw = new BufferedWriter(fw);         
          // Write the content to the file
          bw.write(content);
          bw.newLine(); // Add a newline character
          bw.write(param);
          bw.newLine();
          // Close the BufferedWriter
          bw.close();
          
          System.out.println("Content written to file successfully.");

                
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}
