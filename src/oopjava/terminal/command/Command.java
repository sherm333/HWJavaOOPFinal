package oopjava.terminal.command;

import java.util.Arrays;
import java.util.List;

import oopjava.CommandZoo;
import oopjava.PopulationOfZoo;

public class Command {

    private String action;// введенная строка
    private String animal;
    private List<String> parameters;

    public Command(String action, String animal, List<String> parameters) {
        this.action = action;
        this.animal = animal;
        this.parameters = parameters;
    }

    public boolean isCreate() {
        return action.equals(CommandZoo.ADD.getName());
    }

    public boolean isDelete() {
        return action.equals(CommandZoo.DELETE.getName());
    }

    public boolean isShow() {
        return action.equals(CommandZoo.SHOW.getName());
    }

    public boolean isAll() {
        return animal.equals(PopulationOfZoo.ALL.getName());
    }

    public boolean isLion() {
        return animal.equals(PopulationOfZoo.LION.getName());
    }

    public boolean isWolf() {
        return animal.equals(PopulationOfZoo.WOLF.getName());
    }

    public List<String> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", action, animal, Arrays.toString(parameters.toArray()));
    }
}