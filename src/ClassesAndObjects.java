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
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("У первого человека до пенсии количество лет: " + year1);
        System.out.println("У второго человека до пенсии количество лет: " + year2);

    }
}
class Person{
    String name;
    int age;

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

