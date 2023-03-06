package oopjava.terminal.executable.operations;

import java.util.List;

import oopjava.animals.Lion;
import oopjava.terminal.executable.CommandExecutable;
import oopjava.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private String name;
    private int yearBirth;
    private int countLimbs;
    private double weight;
    private int maneVolume;

    private Zoo zoo;

    public CreateLionExecutable(List<String> input, Zoo zoo) {
        this.name = input.get(0);
        this.yearBirth = Integer.parseInt(input.get(1));
        this.countLimbs = Integer.parseInt(input.get(2));
        this.weight = Double.parseDouble(input.get(3));
        this.maneVolume = Integer.parseInt(input.get(4));
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.addLion(new Lion(
                this.name,
                this.yearBirth,
                this.countLimbs,
                this.weight,
                this.maneVolume));
        zoo.showAllLions();
    }

}