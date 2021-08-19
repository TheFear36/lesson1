package lesson5;

public class Person {
    private String LFP;
    private String post;
    private String email;
    private String  phoneNumber;
    private int pay;
    private int age;

    public Person(String LFP, String post, String email, String phoneNumber, int pay, int age) {
        this.LFP = LFP;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
    }

    public String getLFP() {
        return LFP;
    }

    public void setLFP(String LFP) {
        this.LFP = LFP;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void personInfo() {
        System.out.println("ФИО: " + getLFP());
        System.out.println("Должность: " + getPost());
        System.out.println("Почта: " + getEmail());
        System.out.println("Номер телефона: " + getPhoneNumber());
        System.out.printf("Зарплата: %,d р.%n", getPay());
        System.out.println("Возраст: " + getAge());
        System.out.println();
    }
}

