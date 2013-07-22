package com.shekhar.wordgame.server;

public class Word {

    private final String scrambledWord;
    private final String unscrambbledWord;

    public Word(String scrambbledWord, String unscrambledWord) {
        this.scrambledWord = scrambbledWord;
        this.unscrambbledWord = unscrambledWord;
    }

    public String getScrambledWord() {
        return scrambledWord;
    }

    public String getUnscrambbledWord() {
        return unscrambbledWord;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((scrambledWord == null) ? 0 : scrambledWord.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Word other = (Word) obj;
        if (scrambledWord == null) {
            if (other.scrambledWord != null)
                return false;
        } else if (!scrambledWord.equals(other.scrambledWord))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Word [scrambbledWord=" + scrambledWord + ", unscrambbledWord=" + unscrambbledWord + "]";
    }

}
