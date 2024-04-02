import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PropertyTestStudentJUnit {
	Property property = new Property("Charles Co","Clarksburg",900.0,"Capital One");
	

	@Test
	void testGetPropertyName() {
		assertEquals("Charles Co", property.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(900.00, property.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, property.getPlot().getX());
		assertEquals(0, property.getPlot().getY());
		assertEquals(1, property.getPlot().getWidth());
		assertEquals(1, property.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("Charles Co,Clarksburg,Capital One,900.0",property.toString());	
	}

}