package exception_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class IOExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        try{
            Scanner scanner = new Scanner(new FileInputStream(file));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("hello");
        }
    }
}
