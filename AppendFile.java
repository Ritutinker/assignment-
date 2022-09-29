package IOLab;
//2.Write a Java program to append text to an existing file.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class AppendFile {
     public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "Ritu.txt";
             FileWriter fw = new FileWriter(filename,true); 
             //appends the string to the file
             fw.write("Its java Append class \n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("Ritu.txt"));
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }
  }