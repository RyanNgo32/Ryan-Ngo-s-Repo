
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PlotTestStudentJUnit {

	Plot plot2 = new Plot(0,0,10,10);
	Plot plot4 = new Plot(1,1,1,1);
	Plot plot5 = new Plot(1,1,3,4);
	Plot plot6 = new Plot(1,1,1,1);
	
	@Test
	public void testOverlaps() {
		assertTrue(plot5.overLaps(plot6)); // plot2 entirely overlaps plot4
	}
	
	@Test
	public void testEncompasses()
	{
		assertTrue(plot2.encompasses(plot4)); 
	}
	
	@Test
	public void testToString() {
		assertEquals("1,1,1,1",plot4.toString());	
	}

}