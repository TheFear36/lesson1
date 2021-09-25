package lesson8;

public class Wall implements Challenge{

    private final int heightWall;

    @Override
    public void start (Participant participant){
        if (participant.getHeightJump() >= heightWall) {
            System.out.println(participant + " перепрыгнул препятствие.");
        }
        System.out.println(participant + " не смог перепрыгнуть");
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
