package HW1;

public class Abonement {
    private double cost;
    private int duration;
    private int visits;

    public Abonement(double cost, int duration, int visits) {
        this.cost = cost;
        this.duration = duration;
        this.visits = visits;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public boolean isActive() {
        return duration > 0 && visits > 0;
    }
}