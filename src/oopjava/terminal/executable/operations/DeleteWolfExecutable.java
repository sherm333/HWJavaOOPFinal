package oopjava.terminal.executable.operations;

import oopjava.terminal.executable.CommandExecutable;
import oopjava.zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfWolf();
    }

}