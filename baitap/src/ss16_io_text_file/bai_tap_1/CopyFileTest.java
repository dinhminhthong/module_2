package ss16_io_text_file.bai_tap_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileTest {
    public static final String File_Name = "D:\\codegym\\module_2\\baitap\\src\\ss16_io_text_file\\bai_tap_1\\Student.cvs";
    public static final String File_Coppy = "D:\\codegym\\module_2\\baitap\\src\\ss16_io_text_file\\bai_tap_1\\TestFile.csv";

    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        int sum = 0;
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            fileWriter = new FileWriter(File_Coppy);
            bufferedWriter = new BufferedWriter(fileWriter);
            fileReader = new FileReader(File_Name);
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                System.out.println(line);
                sum +=line.length();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}




