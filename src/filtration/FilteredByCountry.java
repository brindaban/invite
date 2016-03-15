package filtration;

import personEntities.Address;
import personEntities.Age;

public class FilteredByCountry implements Filter {
    CountryPredicate countryPredicate;
    public FilteredByCountry(CountryPredicate countryPredicate) {
        this.countryPredicate = countryPredicate;
    }

    @Override
    public boolean isValid(Age age, Address address) {
        return address.isAllowed(countryPredicate);
    }
    
}
