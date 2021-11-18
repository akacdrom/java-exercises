package pl.home;

public class Mammals extends Animals {

    public Mammals(String name, String surname,int age, String race){
        super(name,surname,age, race);
        speak();
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getAge());
    }

}
