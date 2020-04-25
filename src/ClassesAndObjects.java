public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();

        person1.sayHello(person2);



    }
}
class Person{
    String name;
    int age;

    void speak(){
        for (int i=0; i<3; i++)
            System.out.println("Меня зовут " + name + ", мне уже " + age + "(");
    }

    void sayHello(Person person){
        System.out.println("Привет " + person.name + "! Это " + name + ".");
    }
}

