package hw5;

public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Kozlov Roman", "Developer", "Kozlovr@mail.com", "891091800", 40000, 41);
        persArray[2] = new Person("Sidorov Ilya", "Engineer", "sidorovvv@gmail.com", "880055535", 45000, 37);
        persArray[3] = new Person("Petrov Andrey", "Designer", "petrovandr@yandex.ru", "89107654", 32000, 43);
        persArray[4] = new Person("Romanow Petr", "Programmer", "PRomanov@mailbox.com", "892057210", 60000, 45);

        printElder40(persArray);
    }

    // распечатывет информацию о сотрудниках старше 40
    public static void printElder40(Person[] arr) {

        for (Person x : arr) {

            if (x.getAge() >= 40) {
                x.printData();
            }
        }

    }

}
