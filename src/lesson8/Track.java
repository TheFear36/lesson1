package lesson8;


public class Track implements Challenge {

    private final int distanceTrack;

    @Override
    public void start (Participant participant) {
        participant.run();
    }

    public Track(int distanceTrack) {
        this.distanceTrack = distanceTrack;
    }

    public boolean startTest(Participant participant) {
        return participant.getDistance() >= distanceTrack;
    }

    @Override
    public String toString() {
        return "Впереди дорога с расстоянием " + distanceTrack;
    }

}
