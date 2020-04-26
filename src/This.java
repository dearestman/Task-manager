public class This {
    public static void main(String[] args) {
        Human h1 = new Human("Dima", 22);
        Human h2 = new Human("Olya", 22);
        Human.printNumberOfPeople();
    }
}
class Human{

    String name;
    int age;
    private static int countPeople;


    public Human(String name, int age){
        if (name!="" && age>=0){
            this.name = name;
            this.age = age;
            countPeople++;
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

    public static void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }


}

