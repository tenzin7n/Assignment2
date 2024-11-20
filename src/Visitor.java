public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    // Default constructor
    public Visitor() {}

    // Parameterized constructor
    public Visitor(String name, int age, String contact, String visitorId, String ticketType) {
        super(name, age, contact);
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    // Getters and setters
    public String getVisitorId() { return visitorId; }
    public void setVisitorId(String visitorId) { this.visitorId = visitorId; }
    public String getTicketType() { return ticketType; }
    public void setTicketType(String ticketType) { this.ticketType = ticketType; }
}