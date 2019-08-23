package lesson02;


import java.util.Objects;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private static int count;
    private long personHash;

    Person (String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.personHash = hashCode();
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    static {
        System.out.println("Loading once BEFORE class.");
    }

    {
        System.out.println(count + " time(s) class loaded.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age + '\'' +
                ", hash=" +  personHash + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Person person1 = new Person("Bill", "Lom", 50 );
        Person person2 = new Person("Bill", "Lom", 50 );
        Person person3 = new Person("John", "Wick", 30 );


        System.out.println(person1==person2);
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person2));

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
