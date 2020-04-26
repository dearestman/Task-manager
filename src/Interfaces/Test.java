package Interfaces;

public class Test {

    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Dimak");
        Animal animal = new Animal(2);
        Person person = new Person("Ddsa");
        info1.showInfo();
        info2.showInfo();
        outPutInfo(info1);
        outPutInfo(info2);
        outPutInfo(animal);
        outPutInfo(person);
    }

    public static void outPutInfo(Info info ){
        info.showInfo();
    }
}
