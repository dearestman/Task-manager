import javax.swing.*;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Какое-то имя");
        person1.setAge(45);
        person1.speak();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
//        person1.setName("");
        person1.setAge(-2);
    }
}
class Person{
    private String name;
    private int age;

    void setName(String username){
        if (username.isEmpty())
            System.out.println("Ошибка: имя не может быть путсое!!!");
        else
        name=username;
    }

    public String getName(){
        return name;
    }
    void setAge(int userage){
        if (userage<0)
            System.out.println("Ошибка, возраст должен быть положительный");
        else
            age=userage;
    }

    public int getAge(){
        return age;
    }


    void setNameAndAge(String username, int userage){
        name=username;
        age=userage;
    }

    int calculateYearsToRetirement(){
        return 65-age;
    }

    void speak(){
        for (int i=0; i<3; i++)
            System.out.println("Меня зовут " + name + ", мне уже " + age + "(");
    }

    void sayHello(Person person){
        System.out.println("Привет " + person.name + "! Это " + name + ".");
    }
}

