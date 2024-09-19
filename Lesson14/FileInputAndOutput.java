package Lesson14;

import java.io.*;
import java.util.Scanner;

public class FileInputAndOutput {
    public static void main(String[] args) throws IOException {

        String strOne = new FileInputAndOutput().word();
        BufferedWriter writer = new BufferedWriter(new FileWriter("Lesson14/myFile2.txt"));
        writer.write(strOne);
        writer.close();
        System.out.println(strOne);
    }

    public String word() throws IOException {
        String theLongestWord = "";
        String current;
        Scanner scanner = new Scanner(new File("Lesson14/RomeoAndJulietta.txt"));

        while (scanner.hasNext()) {
            current = scanner.next();
            if ((current.length() > theLongestWord.length())) {
                theLongestWord = current;
            }
        }
        return theLongestWord;
    }
}
