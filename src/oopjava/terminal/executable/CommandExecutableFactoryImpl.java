package oopjava.terminal.executable;

import oopjava.terminal.command.Command;
import oopjava.terminal.executable.operations.CreateLionExecutable;
import oopjava.terminal.executable.operations.CreateWolfExecutable;
import oopjava.terminal.executable.operations.DeleteLionExecutable;
import oopjava.terminal.executable.operations.DeleteWolfExecutable;
import oopjava.terminal.executable.operations.ShowAllExecutable;
import oopjava.terminal.executable.operations.ShowLionExecutable;
import oopjava.terminal.executable.operations.ShowWolfExecutable;
import oopjava.zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {

        if (input.isCreate()) {
            if (input.isLion()) {
                return new CreateLionExecutable(input.getParameters(), zoo);
            }
            if (input.isWolf()) {
                return new CreateWolfExecutable(input.getParameters(), zoo);
            }
        }
        if (input.isDelete()) {
            if (input.isLion()) {
                return new DeleteLionExecutable(zoo);
            }
            if (input.isWolf()) {
                return new DeleteWolfExecutable(zoo);
            }
        }

        if (input.isShow()) {
            if (input.isLion()) {
                return new ShowLionExecutable(zoo);
            }
            if (input.isWolf()) {
                return new ShowWolfExecutable(zoo);
            }
            if (input.isAll()) {
                return new ShowAllExecutable(zoo);
            }
        }
        return null;
    }

}
