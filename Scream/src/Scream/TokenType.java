package Scream;

enum TokenType {
    // single character tokens
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // one or two character tokens
     NOT_EQUAL, EQUAL, EQUAL_EQUAL, GREATER, GREATER_EQUAL, LESS, LESS_EQUAL, AND, OR,

    // Literals
    IDENTIFIER, STRING, NUMBER,

    //Keywords
    LET, VAR, FUNC, BEGIN, END, ARRAY, IF, ELSE, NOT,WHILE, PRINT, TRUE, FALSE, NIL, RETURN, HALT,

    EOF,
}