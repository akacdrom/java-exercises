package pl.home;

public class Animals{
    private String name;
    private String surname;
    private String race;
    private int age;

    public Animals(String name, String surname,int age, String race){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.race = race;
    }

    public void speak(){
        System.out.println("hey i'm " + race);
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

}
