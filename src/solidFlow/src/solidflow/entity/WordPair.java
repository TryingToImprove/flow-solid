/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidflow.entity;

/**
 *
 * @author rolf
 */
public class WordPair {

    private String danishWord;
    private String englishWord;
    private int priority;

    public WordPair(String danishWord, String englishWord, int priority) {
        this.danishWord = danishWord;
        this.englishWord = englishWord;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDanishWord() {
        return danishWord;
    }

    public void setDanishWord(String danishWord) {
        this.danishWord = danishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

}
