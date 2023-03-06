package oopjava.terminal.executable.operations;

import oopjava.terminal.executable.CommandExecutable;
import oopjava.zoo.Zoo;

public class ShowAllExecutable implements CommandExecutable {

    private Zoo zoo;

    public ShowAllExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.showAllAnimals();
    }

}