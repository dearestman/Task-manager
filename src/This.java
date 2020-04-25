public class This {
    public static void main(String[] args) {
        Human human1 = new Human("Dima", 22);
        Human human2 = new Human();
        human1.getInfo();
        human2.getInfo();

    }
}
class Human{

    public Human(){
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    String name;
    int age;

    public Human(String name, int age){
        if (name!="" && age>=0){
            this.name = name;
            this.age = age;
        } else {
            System.out.println("Не правильно указан возвраст или имя!!!");
        }

    }


    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println("name: " + name + ", age: " + age);
    }

}

