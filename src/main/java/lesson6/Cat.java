package lesson6;

public class Cat extends Animals {

    private final String nick;

    public Cat(String nick) {
        super(nick);
        this.nick = nick;
    }

    @Override
    public String getNick() {
        return nick;
    }

    @Override
    public void run(int distant) {
        if (distant > 200) {
            System.out.println("Кот " + nick + " пробежал 200 метров и лёг отдохнуть.");
        } else if (distant <= 0){
            System.out.println("Кот " + nick + " отказался бежать");
        }else {
            System.out.println("Кот " + nick + " пробежал " + distant + " метров.");
        }
    }

    @Override
    public void swim(int distant) {
        System.out.println("Кот " + nick + " не умеет плавать.");
    }



}
