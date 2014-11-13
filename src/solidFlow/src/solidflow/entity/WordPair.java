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
    private String priority;

    public WordPair(String danishWord, String englishWord, String priority) {
        this.danishWord = danishWord;
        this.englishWord = englishWord;
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
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
