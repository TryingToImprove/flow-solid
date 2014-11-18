package solidflow.logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import solidflow.domain.WordPairControlInterface;
import solidflow.entity.WordPair;
import solidflow.entity.WordPairRepository;

public class WordPairControl implements WordPairControlInterface {

    WordPairRepository wordPairRepository;
    HashMap<String, WordPair> wordList;
    private Random random;

    public WordPairControl() {
        wordPairRepository = new WordPairRepository();
        wordList = new HashMap<>();
        random = new Random();

    }

    @Override
    public void add(String question, String answer) {
        WordPair wordPair = new WordPair(question, answer, 1);
        wordList.put(wordPair.getDanishWord(), wordPair);
    }

    @Override
    public int size() {
        return wordList.size();
    }

    @Override
    public String getRandomQuestion() {
        int randomNumber = random.nextInt(16);
        int priority = getPriority(randomNumber);

        List<WordPair> possibleWordPairs = new LinkedList<>();
        for (String key : wordList.keySet()) {
            WordPair wordPair = wordList.get(key);

            if (wordPair.getPriority() == priority) {
                possibleWordPairs.add(wordPair);
            }
        }

        if (possibleWordPairs.isEmpty()) {
            return getRandomQuestion();
        }

        int randomPossibleNumber = random.nextInt(possibleWordPairs.size());
        return possibleWordPairs.get(randomPossibleNumber).getDanishWord();
    }

    @Override
    public boolean checkGuess(String question, String guess) {
        if (!wordList.containsKey(question)) {
            return false;
        }
        
        WordPair wordPair = wordList.get(question);
        boolean isCorrect = wordPair.getEnglishWord().equalsIgnoreCase(guess);
        int priority = wordPair.getPriority();
        
        if (isCorrect) {
            priority++;
        } else {
            priority--;
        }
        
        if(priority >= 1 && priority <=5){
            wordPair.setPriority(priority);
        }
        return isCorrect;
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
        try {
            List<WordPair> wordPairs = new ArrayList<>();
            for (String key : wordList.keySet()) {
                wordPairs.add(wordList.get(key));
            }

            wordPairRepository.add(filename, wordPairs);

            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    @Override
    public void clear() {
        wordList.clear();
    }

    private int getPriority(int number) {
        if (number >= 0 && number <= 5) {
            return 1;
        }

        if (number >= 6 && number <= 9) {
            return 2;
        }

        if (number >= 10 && number <= 12) {
            return 3;
        }

        if (number >= 13 && number <= 14) {
            return 4;
        }

        if (number == 15) {
            return 5;
        }

        return 1;
    }
}
