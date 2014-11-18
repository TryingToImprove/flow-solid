/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidflow.entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author rolf
 */
public class WordPairRepository {

    public List<WordPair> findAll(String filename) throws FileNotFoundException {
        ArrayList<String> strWords = new ArrayList();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();

                strWords.add(currentLine);
            }
        }

        return strWords.stream()
                .map(str -> deserialize(str))
                .collect(Collectors.toList());
    }

    public void add(String filename, List<WordPair> wordPairs) throws IOException {

        try (PrintWriter output = new PrintWriter(filename, "UTF-8")) {
            for (WordPair wordPair : wordPairs) {
                output.println(serialize(wordPair));
            }
        }

    }

    private WordPair deserialize(String str) {
        String[] strArr = str.split(",");

        String danishWord = strArr[0].trim();
        String englishWord = strArr[1].trim();
        int priority = Integer.parseInt(strArr[2].trim());

        return new WordPair(danishWord, englishWord, priority);
    }

    private String serialize(WordPair word) {
        return word.getDanishWord() + "," + word.getEnglishWord() + "," + word.getPriority();
    }
}
