package personEntities;

public class Guest {
    private Name name;

    private Gender gender;

    private Age age;

    private Address address;

    public Guest(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public static Guest createGuest(String firstName, String lastName, String sex, String age, String city, String state, String country) {
        Name name = new Name(firstName, lastName);
        Gender gender = Gender.valueOf(sex.toUpperCase());
        Address address = new Address(city, state, country);
        return new Guest(name, gender, new Age(Integer.parseInt(age)), address);
    }

}