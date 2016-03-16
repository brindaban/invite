package filtration.age;

import filtration.Filter;
import personEntities.Address;
import personEntities.Age;

public class FilteredByAge implements Filter {
    private final AgePredicate agePredicate;

    public FilteredByAge(AgePredicate agePredicate) {
        this.agePredicate = agePredicate;
    }

    @Override
    public boolean isValid(Age age, Address address) {
        return age.isValid(agePredicate);
    }
}
