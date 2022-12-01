import class01.SameName;

public class Main {
    public static void main(String[] args) {
        Employee boss = new Employee("Bob", "Boss", "bob@gmail.com", "555 555-3434", 35);
        SameName name1 = new SameName();
        class02.SameName name2 = new class02.SameName();
        Car car = new Car();
        car.start();
    }
}