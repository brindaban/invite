package representation;

import personEntities.Guest;

public class TemplateGenerate {
    private NameFormat nameFormat;
    private AddressFormat addressFormat;

    public TemplateGenerate(NameFormat nameFormat, AddressFormat addressFormat) {
        this.nameFormat = nameFormat;
        this.addressFormat = addressFormat;
    }

    public String generateTemplateForEachGuest(Guest eachGuest){
        String name = eachGuest.generateName(nameFormat);
        String address = eachGuest.generateAddress(addressFormat);
        return getPattern((name+"\n"+address).split("\n"));
    }

    private String getPattern(String [] splittedData) {
        int maximumWidth = getMaximumWidth(splittedData);
        String firstAndLastLine = makefixedLine("+",maximumWidth);
        String thirdLine = makefixedLine("|",maximumWidth);
        String secondLine = "| " + splittedData[0] + getSpaces(splittedData[0].length(),maximumWidth) + "|";
        String forthLine = "| " + splittedData[1] + getSpaces(splittedData[1].length(),maximumWidth) + "|";
        String fifthLine = "| " + splittedData[2] + getSpaces(splittedData[2].length(),maximumWidth) + "|";
        return firstAndLastLine+"\n"+secondLine+"\n"+thirdLine+"\n"+forthLine+"\n"+fifthLine+"\n"+firstAndLastLine+"\n";
    }

    private int getMaximumWidth(String[] splittedData) {
        int maximumLength = splittedData[0].length();
        for (int i = 1;i<splittedData.length;i++)
            if(maximumLength<splittedData[i].length())
                maximumLength = splittedData[i].length();
        return maximumLength+4;
    }

    private String makefixedLine(String edgesCharacter,int lengthOfThePattern) {
        return edgesCharacter + new String(new char[lengthOfThePattern - 2]).replace("\0", "-") + edgesCharacter;
    }

    private String getSpaces(int length,int lengthOfThePattern) {
        return new String(new char[lengthOfThePattern - length - 3]).replace("\0", " ");
    }
}
