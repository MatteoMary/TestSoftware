public class CampusEvent {
    private String eventName;
    private String date;
    private String location;

    public CampusEvent(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
}
