package oopjava.terminal.executable.operations;

import java.util.List;

import oopjava.animals.Wolf;
import oopjava.terminal.executable.CommandExecutable;
import oopjava.zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {

    private String name;
    private int yearBirth;
    private int countLimbs;
    private double weight;

    private Zoo zoo;

    public CreateWolfExecutable(List<String> input, Zoo zoo) {

        this.name = input.get(0);
        this.yearBirth = Integer.parseInt(input.get(1));
        this.countLimbs = Integer.parseInt(input.get(2));
        this.weight = Double.parseDouble(input.get(3));
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.addWolf(new Wolf(
                this.name,
                this.yearBirth,
                this.countLimbs,
                this.weight));
        zoo.showAllWolf();
    }

}