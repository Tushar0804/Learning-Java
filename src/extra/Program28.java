package extra;

import java.io.*;

public class Program28
{
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try
        {
            reader = new BufferedReader(new FileReader("/Users/tusharsharma/B Tech/4th Semester/Learning Java/src/extra/sample.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;

                for (String word : words)
                {
                    charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
            }
            System.out.println("***************");
            System.out.println("program to find number of lines, word and sentences");
            System.out.println("****************");
            System.out.println("Number of character in file : "+charCount);
            System.out.println("Number of words in a file : "+wordCount);
            System.out.println("Number of lines in file : "+lineCount);
            System.out.println("---------------------------------------------------");
            System.out.println("CODE BY : RASHMI , 20012531 , Roll no. 45");
            System.out.println("---------------------------------------------------");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
