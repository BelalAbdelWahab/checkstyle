package com.puppycrawl.tools.checkstyle.grammar;

public class InputEmbeddedNullChar
{
    public void doSomething()
    {
        // String below has an embedded null in it as well as char 036 repeated
        // twice - none of shich should cause a problem as they're all valid
        // UTF-8
        String cctCxlMsg = ":ET:OE:}} ";
    }

}
