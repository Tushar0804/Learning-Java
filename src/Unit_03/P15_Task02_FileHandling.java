package Unit_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P15_Task02_FileHandling
{
    public static void main(String[] args) throws IOException
    {
        String path = "/Users/tusharsharma/B Tech/4th Semester/Learning Java/src/Unit_03/Input.txt";
        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        int ch;
        int count = 0;
        while((ch = br.read()) != -1)
        {
            if(ch == ' ' || ch == '\n')
                count ++;
        }
        System.out.println(count);
    }
}
