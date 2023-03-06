package oopjava.terminal.executable;

import oopjava.terminal.command.Command;

public interface CommandExecutableFactory {
    public CommandExecutable create(Command command);
}