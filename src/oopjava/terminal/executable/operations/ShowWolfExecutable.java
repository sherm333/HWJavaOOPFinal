package oopjava.terminal.executable.operations;

import oopjava.terminal.executable.CommandExecutable;
import oopjava.zoo.Zoo;

public class ShowWolfExecutable implements CommandExecutable {

    private Zoo zoo;

    public ShowWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.showAllWolf();
    }

}