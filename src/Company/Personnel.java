package Company;

import java.util.Arrays;

public class Personnel {

    public String name;
    public String position;
    public String mailbox;
    public String phone;
    int salary;
    int age;
    public Personnel next;

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", mailbox='" + mailbox + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Personnel(String name, String position, String mailbox, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mailbox = mailbox;
        this.phone = phone;
        this.salary = salary;
        this.age = age;


    }

    public Personnel (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void showExperience(int age, Personnel[] stuffArray) {
        for (int i = 0; i < 5; i++) {
            if (stuffArray[i].age > age) {
                System.out.println(stuffArray[i]);
            }
        }
    }

    void printPersonnel() {
        System.out.println(this);
    }


    public void print() {
        System.out.println(this);
    }

    public void display() {
        System.out.println("Name:  " + this.name + " , age " + this.age);
    }
}

