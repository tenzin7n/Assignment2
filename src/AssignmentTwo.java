public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo a2 = new AssignmentTwo();
        a2.partThree();
    }

    public void partThree() {
        // Create a Ride with an assigned operator
        Employee operator = new Employee("John", 30, "123456", "E001", "Operator");
        Ride ride = new Ride("Roller Coaster", 5, operator);

        // Create Visitors
        Visitor v1 = new Visitor("Alice", 25, "54321", "V01", "Regular");
        Visitor v2 = new Visitor("Bob", 28, "65432", "V02", "VIP");
        Visitor v3 = new Visitor("Charlie", 22, "98765", "V03", "Regular");
        Visitor v4 = new Visitor("Daisy", 29, "45678", "V04", "VIP");
        Visitor v5 = new Visitor("Eve", 27, "87654", "V05", "Regular");

        // Add Visitors to Queue
        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);

        // Print Queue
        ride.printQueue();

        // Remove a Visitor from Queue
        ride.removeVisitorFromQueue();
        ride.printQueue();

        // Run One Cycle
        ride.runOneCycle();

        // Print Ride History
        ride.printRideHistory();
    }
}