package oopjava;

import oopjava.terminal.TerminalReader;
import oopjava.terminal.parser.CommandParser;
import oopjava.terminal.parser.CommandParserImpl;
import oopjava.zoo.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        CommandParser parserZoo = new CommandParserImpl();
        TerminalReader.newTerminalReader(parserZoo, zoo);
    }

}