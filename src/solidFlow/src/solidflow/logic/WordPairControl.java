package solidflow.logic;

import java.util.HashMap;
import solidflow.domain.WordPairControlInterface;
import solidflow.entity.WordPair;
import solidflow.entity.WordPairRepository;

public class WordPairControl implements WordPairControlInterface {

    <<<<<<< Updated upstream
    HashMap<String, WordPair> wordList;
    WordPairRepository wordPairRepository;

    public WordPairControl() {
        wordPairRepository = new WordPairRepository();
    }
    =======
    WordPair gg;
    ArrayList<WordPair> wordList = new ArrayList();
    >>>>>>> Stashed changes

    @Override

    public void add(String question, String answer) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            wordList = new HashMap<>();

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
