package app.LaboratoryN3;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LaboratoryN3 {
    public static void main(String[] args) {
        StringBuffer initText = new StringBuffer();
        StringBuffer iSentence = new StringBuffer();
        StringBuffer foundWords = new StringBuffer();

        FileDialog openDialog = new FileDialog((Frame)null, "Choose a file", FileDialog.LOAD);
        openDialog.setFile("*.txt");
        openDialog.setVisible(true);
        String filename = openDialog.getFile();
        String directory = openDialog.getDirectory();

        File txtFile = new File(directory + filename);
        try(Scanner readTxtFile = new Scanner(txtFile)) {
            while (readTxtFile.hasNextLine()) {
                initText.append(readTxtFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist!");
            System.exit(1);
        } 

        for (int startIndex = 0, signIndex; ; ) {
            signIndex = initText.indexOf("?", startIndex);
            if (signIndex == -1)
                break;
            for (int i = signIndex - 1; ; i--) {
                char currChar = initText.charAt(i);
                if ((currChar == '.') || (currChar == '!') || (currChar == '?') || (i == -1)) {
                    iSentence.append(initText.substring(i + 1, signIndex + 1));
                    startIndex = signIndex + 1;
                    break;
                }
            }
        }

        int wordLen = 0;
        boolean isInteger = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired word length >");
        while(!(isInteger)) {
            try {
                wordLen = input.nextInt();
            } catch(InputMismatchException e) {
                input.nextLine();
                isInteger = false;
                continue;
            }
            if (wordLen >= 1)
                isInteger = true;
        }
        input.close();

        for (String word: iSentence.toString().split("[[0-9]\\s,.?–\"]+")) {
            if ((word.length() == wordLen) && (foundWords.indexOf(word) == -1)) {
                foundWords.append(word + "\n");
            }
        }
        System.out.println("The content of " + filename + ":\n" + initText);
        System.out.println("Found sentences:\n" + iSentence);
        System.out.println("Found words:\n" + foundWords);
        System.exit(0);
    }
}