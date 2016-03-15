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
        return name+"\n"+address;
    }
}
