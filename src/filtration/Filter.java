package filtration;

import personEntities.Address;
import personEntities.Age;

public interface Filter {
    boolean isValid(Age age, Address address);
}
