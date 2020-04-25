public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут " + person1.name + ". И мне уже " + person1.age);

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        System.out.println("Меня зовут " + person2.name + ". И мне уже " + person2.age);


    }
}
class Person{
    String name;
    int age;
}

