public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");

        String firstName = "Ivan";
        firstName = ' '+ firstName;
        String middleName  = "Ivanovich";
        middleName = ' ' + middleName;
        String lastName  = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задание 2
        System.out.println("Задание 2");

        String firstNameUpper=firstName.toUpperCase();
        String middleNameUpper=middleName.toUpperCase();
        String lastNameUpper=lastName.toUpperCase();
        fullName = lastNameUpper+firstNameUpper+middleNameUpper;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // Задание 3
        System.out.println("Задание 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
}