package solidflow.logic;

import java.util.HashMap;
import solidflow.domain.WordPairControlInterface;
import solidflow.entity.WordPair;
import solidflow.entity.WordPairRepository;

public class WordPairControl implements WordPairControlInterface {

    WordPairRepository wordPairRepository;
    HashMap<String, WordPair> wordList;
    
    public WordPairControl() {
        wordPairRepository = new WordPairRepository();
        wordList = new HashMap<>();
    }

    @Override
    public void add(String question, String answer) {
        WordPair wordPair = new WordPair(question, answer, 0);
        wordList.put(wordPair.getDanishWord(), wordPair);
    }

    @Override
    public int size() {
        return wordList.size();
    }

    @Override
    public String getRandomQuestion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkGuess(String question, String quess) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String lookup(String question) {
        if (wordList.containsKey(question)) {
            return wordList.get(question).getEnglishWord();
        }

        return null;
    }

    @Override
    public boolean load(String filename) {
        try {
            for (WordPair wordPair : wordPairRepository.findAll(filename)) {
                wordList.put(wordPair.getDanishWord(), wordPair);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean save(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
