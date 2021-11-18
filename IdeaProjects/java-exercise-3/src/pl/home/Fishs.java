package pl.home;

public class Fishs extends Animals {

    public Fishs(String name, String surname, int age, String race) {
        super(name, surname, age, race);
        speak();
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getAge());
    }
}
