package ru.geekbrains.homework1;

public class HomeWorkApp {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Lena Zhuk", "Lead Developer", "qwerty@gmail.com", "8921374", 500000.00, 22);
        empArray[1] = new Employee("Lupa Olegovna", "designer", "asdfgg@gmail.com", "88719927", 80000.00, 41);
        empArray[2] = new Employee("Pupa Victorovna", "engineer", "hfjsjgs&icloud.com", "801923876", 200000.00, 23);
        empArray[3] = new Employee("Natalia Pehota", "Senior Developer", "gsgdhsfgsh@mail.ru", "8037394748", 3000000.00, 43);
        empArray[4] = new Employee("Alexey Tereshchenko", "general director", "zxcvvbn@gmail.com", "89091339", 5e5, 22);

        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                System.out.println("employee = " + employee);
            }
        }

    }

}
