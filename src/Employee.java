public class Employee {         // проверить перевод

    private String name;
    private String position; // проверить перевод
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String position, String email, String phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    // Ззовні классу немає доступу до  внутрішніх властивостей класу.
    // При створенні об'єкта заповнюються поля
    // Для доступу до полей можна добавити Getters
    /*
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

     */
}