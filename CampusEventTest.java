import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CampusEventTest {

    @Test
    public void testGetEventName() {
        CampusEvent event = new CampusEvent("Science Fair", "2024-05-15", "Science Building");
        assertEquals("Science Fair", event.getEventName());
    }

    @Test
    public void testGetDate() {
        CampusEvent event = new CampusEvent("Science Fair", "2024-05-15", "Science Building");
        assertEquals("2024-05-15", event.getDate());
    }

    @Test
    public void testGetLocation() {
        CampusEvent event = new CampusEvent("Science Fair", "2024-05-15", "Science Building");
        assertEquals("Science Building", event.getLocation());
    }
}
