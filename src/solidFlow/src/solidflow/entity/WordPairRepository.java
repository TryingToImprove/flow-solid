/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidflow.entity;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author rolf
 */
public class WordPairRepository {

//    private final String WordPair = "WordPair.csv";
//
//    public List<WordPair> findAll() {
//        try {
//            ArrayList<String> strWords = new ArrayList();
//
//            try (Scanner scanner = new Scanner(new File(WordPair))) {
//                while (scanner.hasNextLine()) {
//                    String currentLine = scanner.nextLine();
//
//                    strWords.add(currentLine);
//                }
//            }
//
//            return strWords.stream()
//                    .map(str -> deserialize(str))
//                    .collect(Collectors.toList());
//
//        } catch (IOException ex) {
//            System.out.println("Could not load file!");
//            System.out.println(ex.toString());
//        }
//
//        return new ArrayList<>();
//    }
//
//    public void add(WordPair word) {
//        try {
//            StringBuilder strBuilder = new StringBuilder();
//
//            try (Scanner scanner = new Scanner(new File(WordPair))) {
//                while (scanner.hasNextLine()) {
//                    strBuilder.append(scanner.nextLine()).append("\n");
//                }
//            }
//
//            try (FileWriter output = new FileWriter(new File(WordPair))) {
//                if (strBuilder.length() > 0) {
//                    output.write(strBuilder.toString());
//                }
//
//                output.write(serialize(word));
//            }
//        } catch (IOException ex) {
//            System.out.println("Could not save to file!");
//            System.out.println(ex.toString());
//        }
//    }
//
//    private WordPair deserialize(String str) {
//        String[] strArr = str.split(",");
//
//        String danishWord = strArr[1].trim();
//        String englishWord = strArr[2].trim();
//
//        return new WordPair(danishWord, englishWord);
//    }
//
//    private String serialize(WordPair word) {
//        return word.getDanishWord() + "," + word.getEnglishWord();
//    }
    
public static ArrayList<WordPair> loadPerson(String filename)
    {
        Scanner file_scanner = null;
        ArrayList<WordPair> wordArray = new ArrayList<WordPair>();

        try {
            file_scanner = new Scanner(new File(filename));  //Connection to the file using the Scanner object
        } catch (FileNotFoundException ex) {
            System.out.println("Could not find the file to load from! Returning null.");
            ex.printStackTrace();
            return null;  //If something goes wrong the method returns null
        }

        while (file_scanner.hasNextLine()) {  //File found. Reading one line.             
            String linje = file_scanner.nextLine();
            Scanner sc = new Scanner(linje).useDelimiter(",");
            String danishWord = sc.next();
            String englishWord = sc.next();
            String priority = sc.next();
            WordPair w = new WordPair(danishWord, englishWord, priority);
            System.out.println(w);
            wordArray.add(w);  //Reading in a single line and saving in the ArrayList
        }

        file_scanner.close();  //Closing the file
        return wordArray;    //returning the arraylist
    }    
}
