package TestOstZnania;

public class OOP_Person {
    String fullName;
    int age;

    //Методы
    void move() {
        System.out.println(fullName + " идет");
    }

    void talk() {
        System.out.println(fullName + " говорит");
    }

    //Конструкторы
    public OOP_Person() {
    }

    public OOP_Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public static void main(String[] args) {
        OOP_Person person1 = new OOP_Person();
        OOP_Person person2 = new OOP_Person("Artemiy", 22);

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
