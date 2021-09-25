package lesson6;

public class Dog extends Animals {

    private final String nick;
    private int id;

    public Dog(String nick) {
        super(nick);
        this.nick = nick;
    }

    @Override
    public String getNick() {
        return nick;
    }

    @Override
    public void run(int distant) {
        if (distant > 500) {
            System.out.println("Собака " + nick + " пробежала 500 метров и легла отдохнуть");
        } else if (distant <= 0) {
            System.out.println("Собака " + nick +" сидит и не слушается");
        } else {
            System.out.println("Собака " + nick + " пробежала " + distant + " метров.");
        }
    }

    @Override
    public void swim(int distant) {
        if (distant > 10) {
            System.out.println("Пёс " + nick + " отказался плыть.");
        }else if (distant <= 0){
            System.out.println("Собака " + nick +" сидит и не слушается");
        } else {
            System.out.println("Пёс " + nick + " проплыл " + distant + " метров.");
        }
    }

}
