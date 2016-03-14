package user_interecation;

import filtration.Filter;
import representation.LableGenerator;
import representation.NameFormat;

import java.util.Arrays;

public class Command {
    private String[] commands;

    private Filter filter;

    private LableGenerator lableGenerator;

    public Command(String[] commands) {
        this.commands = commands;
        setCommandsInFilter();

    }

    private void setCommandsInFilter() {

    }

    private NameFormat getNameFormat() {
        String nameFormat = commands[Arrays.asList(commands).indexOf("-nameFormat")+1].toUpperCase();
        return NameFormat.valueOf(nameFormat);
    }

    public String getFileName(){
        return commands[commands.length-1];
    }
}
