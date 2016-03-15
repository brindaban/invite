package personEntities;

import representation.NameFormat;

public class Name {
    private String first;

    private String last;

    public Name(String firstName, String lastName) {
        this.first = firstName;
        this.last = lastName;
    }

    public String callWithPrefix(String prefix, NameFormat nameFormat) {
        return nameFormat.callWithTitle(prefix,first,last);
    }
}
