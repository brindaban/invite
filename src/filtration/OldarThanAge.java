package filtration;

public class OldarThanAge implements AgePredicate{
    private int ageLimit;
    public OldarThanAge(int givenAge) {
        this.ageLimit = givenAge;
    }

    @Override
    public boolean checkValidity(int age) {
        return age>ageLimit;
    }
}
