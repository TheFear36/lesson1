package lesson8;

public class Wall implements Challenge{

    private final int heightWall;

    @Override
    public void start (Participant participant){
        participant.jump();
    }


    @Override
    public boolean startTest(Participant participant) {
        return participant.getHeightJump() >= heightWall;
    }

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public String toString() {
        return "Впереди стена высотой " + heightWall;
    }
}
