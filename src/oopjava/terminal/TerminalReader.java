package oopjava.terminal;

import oopjava.terminal.command.Command;
import oopjava.terminal.executable.CommandExecutable;
import oopjava.terminal.executable.CommandExecutableFactoryImpl;
import oopjava.terminal.menu.View;
import oopjava.terminal.parser.CommandParser;
import oopjava.zoo.Zoo;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private final Zoo zoo;
    private View view = new View();
    private CommandExecutable commandExecutable;

    private TerminalReader(CommandParser commandParser, Zoo zoo) {
        this.commandParser = commandParser;
        this.zoo = zoo;
        endLess();
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser, Zoo zoo) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, zoo);
        }
        return terminalReader;
    }

    public void endLess() {

        while (true) {
            String request = view.start();
            Command command = this.commandParser.parseCommand(request);
            this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(command);
            commandExecutable.execute();
        }
    }
}
