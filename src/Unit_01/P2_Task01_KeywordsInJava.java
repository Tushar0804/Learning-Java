package Unit_01;

// There are 50 keywords in Java

/*
 *  2 are for future use (goto*,const*)
 *  Keywords cannot be used as identifier in Java
 *  Variable name
 *  Function name
 *  class
 *  object
 */

// Write a java program to demonstrate the errors occurred when trying to use keywords as identifiers.

public class P2_Task01_KeywordsInJava
{
    // variable name
    int double =12;
    // syntax error on token "double", invalid VariableDeclaratorId

    // Function name
    int new()
    {
        // sysout[ctrl+space]
        System.out.println("Hello World");
        return 0;
    }
    // Syntax error on token "new", invalid VariableDeclaratorId

    //class name
    class int {};
    //Syntax error on token "int", Identifier expected

    class ABC {};
    ABC int=10;
    // ABC cannot be resolved to a variable
    // Syntax error on token "int", delete this token
}