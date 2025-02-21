package no.hvl.dat102.innlevering2;

import java.util.Stack;

public class ParentesSjekker {

    public boolean sjekkParenteser(String s) {
        Stack<Character> stabel = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (erStartParentes(c)) {
                stabel.push(c);
            } else if (erSluttParentes(c)) {
                if (stabel.isEmpty()) {
                    return false;
                }
                char sisteStart = stabel.pop();
                if (!erParentesPar(sisteStart, c)) {
                    return false;
                }
            }
        }
        
        return stabel.isEmpty();
    }

    private boolean erStartParentes(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    private boolean erSluttParentes(char c) {
        return c == '}' || c == ']' || c == ')';
    }

    private boolean erParentesPar(char start, char slutt) {
        return (start == '(' && slutt == ')') || (start == '[' && slutt == ']') || (start == '{' && slutt == '}');
    }
}
