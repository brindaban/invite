package personEntities;

import filtration.age.AgePredicate;

public class Age {
    private int age;

    public Age(int age) {
        this.age = age;
    }

    public boolean isValid(AgePredicate agePredicate) {
        return agePredicate.checkValidity(age);
    }
}
