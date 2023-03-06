package oopjava.terminal.parser;

import oopjava.terminal.command.Command;
import oopjava.terminal.command.Command;

public interface CommandParser {
    Command parseCommand(String input);
}