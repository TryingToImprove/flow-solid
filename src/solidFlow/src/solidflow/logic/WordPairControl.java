package solidflow.logic;

import java.util.ArrayList;
import solidflow.domain.WordPairControlInterface;
import solidflow.entity.WordPair;
import solidflow.entity.WordPairRepository;



public class WordPairControl implements WordPairControlInterface {
    
    WordPair gg;
    ArrayList<WordPair> wordList = new ArrayList();

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
        if(question == gg.getDanishWord()){
            return gg.getEnglishWord();
        }
        return null;
    }

    @Override
    public boolean load(String filename) {
        wordList = WordPairRepository.loadPerson("WordPair.scv");
        
        
        for(int i = 0; i < wordList.size(); i++){
            
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
