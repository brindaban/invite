package user_interecation;

import filtration.FilterCollection;
import filtration.FiltringOption;
import representation.AddressFormat;
import representation.NameFormat;
import representation.TemplateGenerate;
import filtration.Filter;

import java.util.ArrayList;
import java.util.Arrays;

public class Command {
    private String[] commands;

    private Filter filter;

    public Command(String[] commands) {
        this.commands = commands;
    }

    private int getIndex(String element){
        return Arrays.asList(commands).indexOf(element);
    }

    private NameFormat getNameFormat() {
        String nameFormat = commands[getIndex("-nameFormat")+1].toUpperCase();
        return NameFormat.valueOf(nameFormat);
    }

    public TemplateGenerate getTempleteGenerate(){
        return new TemplateGenerate(getNameFormat(),new AddressFormat());
    }

    public FilterCollection getAllFiterOptionWhichUserWant(){
        ArrayList<Filter> filterStorage = new ArrayList<>();
        int countryIndex = getIndex("-country")+1;
        int ageIndex = getIndex("-age")+1;

        if (countryIndex!=0)
            filterStorage.add(FiltringOption.COUNTRY.getFilter(commands[countryIndex]));
        if (ageIndex!=0)
            filterStorage.add(FiltringOption.AGEABOVE.getFilter(commands[ageIndex]));
        return new FilterCollection(filterStorage);
    }

    public String getFileName(){
        return commands[commands.length-1];
    }
}
