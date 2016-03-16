package filtration.country;

public class FromCountry implements CountryPredicate {
    private String givenCountry;

    public FromCountry(String givenCountry) {
        this.givenCountry = givenCountry;
    }

    public boolean checkValidity(String country){
        return this.givenCountry.equalsIgnoreCase(country);
    }
}