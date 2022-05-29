package exam;

import java.util.Arrays;
import java.util.Scanner;

//字符集合
public class Main {
    private static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            strPrint(str);
            System.out.println();
            index = 0;
        }
    }

    private static void strPrint(String str) {
        char[] arr = str.toCharArray();
        char[] output = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = arr[i];
            boolean isRepeat = false;
            for (int j = 0; j < index; j++) {
                if(output[j] == ch){
                    isRepeat = true;
                }
            }
            if(!isRepeat){
                output[index] = ch;
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(output[i]);
        }
    }
}
