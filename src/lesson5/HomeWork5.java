package lesson5;

public class HomeWork5 {
    public static void main(String[] args) {


        //Person person = new Person("Иванов Иван Иванович", "Инженер", "ivanovivan@mail.ru", "8-996-665-88-74", 35000, 36);
        //person.personInfo();

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Кузнецов Алексей Юрьевич", "Оператор производственной линии", "kuzNET@mail.ru", "8-903-456-98-32", 27000, 25);
        personArray[1] = new Person("Шилова Анна Игоревна", "Коммерческий директор", "sheLOVEann@mail.ru", "8-924-695-89-63", 60000, 41);
        personArray[2] = new Person("Самохвалов Эдуард Евгеньевич" , "Токарь" , "edusam78@mail.ru", "8-999-779-36-10", 45000, 53);
        personArray[3] = new Person("Козлов Александр Сергеевич" , "Начальник цеха" , "kozLOVE@mail.ru", "8-904-559-66-54", 45000, 51);
        personArray[4] = new Person("Басин Никита Олегович" , "Сварщик" , "basota69@mail.ru", "8-903-987-65-14", 25000, 26);


        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() > 40) {
                personArray[i].personInfo();
            }
        }
    }
}
