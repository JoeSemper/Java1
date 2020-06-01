package hw5;

public class Person {

    private String name;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    // конструтор
    public Person(String name, String position, String email,
                  String telephone, int salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    // распечатывает информацию
    public void printData() {

        System.out.printf("Имя: %s; Должность: %s; Email: %s; тел: %s; Зараплата: %d; Возраст: %d \n",
                           name, position, email, telephone, salary, age);
    }

    public int getAge() {
        return age;
    }
}
