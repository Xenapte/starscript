package meteordevelopment.starscript.utils;

import meteordevelopment.starscript.compiler.Expr;

/** Class for storing errors produced while parsing. */
public class Error {
    public final int line;
    public final int character;
    public final char ch;
    public final String message;
    public Expr expr;

    public Error(int line, int character, char ch, String message, Expr expr) {
        this.line = line;
        this.character = character;
        this.ch = ch;
        this.message = message;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return String.format("[line %d, character %d] at '%s': %s", line, character, ch, message);
    }
}
