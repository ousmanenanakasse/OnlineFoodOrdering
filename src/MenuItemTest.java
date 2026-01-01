import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuItemTest {

    @Test
    void testMenuItemCreation() {
        // 1. Create a new item
        MenuItem item = new MenuItem("Burger", 8.99);

        // 2. Check if the name and price were saved correctly
        assertEquals("Burger", item.getName(), "Name should be Burger");
        assertEquals(8.99, item.getPrice(), "Price should be 8.99");
    }

    @Test
    void testToString() {
        MenuItem item = new MenuItem("Soda", 2.00);
        // Check if the text format matches what we expect
        assertEquals("Soda - $2.0", item.toString());
    }
}