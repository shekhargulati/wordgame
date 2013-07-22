package com.shekhar.wordgame.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class WordRepository {

    private final static Map<String, Word> WORDS = new HashMap<String, Word>() {
        private static final long serialVersionUID = 1L;

        {
            put("rfdien", new Word("rfdien", "friend"));
            put("nealr", new Word("nealr", "learn"));
            put("leogog", new Word("leogog", "google"));
            put("hticts", new Word("hticts", "stitch"));
            put("vaaj", new Word("vaaj", "java"));
            put("graprom", new Word("graprom", "program"));
            put("saknth", new Word("saknth", "thanks"));
            put("nithk", new Word("nithk", "think"));
            put("weameso", new Word("weameso", "awesome"));
            put("nedo", new Word("nedo", "done"));
            put("welyol", new Word("welyol", "yellow"));
            put("poendint", new Word("poendint", "endpoint"));
            put("elocs", new Word("elocs", "close"));
            put("meag", new Word("meag", "game"));
        }
    };

    private static final WordRepository INSTANCE = new WordRepository();

    private List<String> keys = new ArrayList<String>(WORDS.keySet());

    private Random random = new Random();

    private WordRepository() {

    }

    public static WordRepository getInstance() {
        return INSTANCE;
    }

    public Word getRandomWord() {
        return WORDS.get(keys.get(random.nextInt(keys.size())));
    }

    public Word getWord(String scrambledWord) {
        return WORDS.get(scrambledWord);
    }

}
