package personEntities;

import filtration.CountryPredicate;
import representation.AddressFormat;

public class Address {
        private String city;

        private String state;

        private String country;

        public Address(String city, String state, String country) {
            this.city = city;
            this.state = state;
            this.country = country;
        }

    public boolean isAllowed(CountryPredicate countryPredicate) {
        return countryPredicate.checkValidity(country);
    }

    public String represent(AddressFormat addressFormat) {
        return addressFormat.represent(city,state,country);
    }
}