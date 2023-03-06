package oopjava.terminal.executable.operations;

import oopjava.terminal.executable.CommandExecutable;
import oopjava.zoo.Zoo;

public class ShowLionExecutable implements CommandExecutable {

    private Zoo zoo;

    public ShowLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.showAllLions();
    }

}