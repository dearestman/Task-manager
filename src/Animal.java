import Interfaces.Info;

public class Animal implements Info {
    String name = "Some animal";
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }
    public void showName(){
        System.out.println(name );
    }

    @Override
    public void showInfo() {

    }
}
