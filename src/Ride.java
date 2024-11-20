import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private int maxRiders;
    private int numOfCycles = 0;
    private Employee operator;
    private Queue<Visitor> queue = new LinkedList<>();
    private LinkedList<Visitor> rideHistory = new LinkedList<>();

    // Default constructor
    public Ride() {}

    // Parameterized constructor
    public Ride(String rideName, int maxRiders, Employee operator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }

    // Getters and setters
    public String getRideName() { return rideName; }
    public void setRideName(String rideName) { this.rideName = rideName; }
    public int getMaxRiders() { return maxRiders; }
    public void setMaxRiders(int maxRiders) { this.maxRiders = maxRiders; }
    public Employee getOperator() { return operator; }
    public void setOperator(Employee operator) { this.operator = operator; }

    // Implementing RideInterface
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println(visitor.getName() + " added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue() {
        Visitor removed = queue.poll();
        if (removed != null) {
            System.out.println(removed.getName() + " removed from the queue.");
        } else {
            System.out.println("Queue is empty.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Queue: ");
        for (Visitor v : queue) {
            System.out.println(v.getName());
        }
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned. Cannot run the ride.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("No visitors in the queue. Cannot run the ride.");
            return;
        }

        System.out.println("Running one cycle...");
        for (int i = 0; i < maxRiders && !queue.isEmpty(); i++) {
            Visitor visitor = queue.poll();
            addVisitorToHistory(visitor);
        }
        numOfCycles++;
        System.out.println("Cycle completed. Total cycles run: " + numOfCycles);
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor v : rideHistory) {
            System.out.println(v.getName());
        }
    }
}