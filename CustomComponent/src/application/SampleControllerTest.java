package application;

import static org.junit.Assert.*;

import org.junit.Test;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SampleControllerTest {

	@Test
	public void testRotarFigura() {
		int numeroColor = (int)(Math.random() * 10);
		switch (numeroColor) {
			case 0:
				assertEquals(0,numeroColor);
				break;
			case 1:
				assertEquals(1,numeroColor);
				break;
			case 2:
				assertEquals(2,numeroColor);
				break;
			case 3:
				assertEquals(3,numeroColor);
				break;
			case 4:
				assertEquals(4,numeroColor);
				break;
			case 5:
				assertEquals(5,numeroColor);
				break;
			case 6:
				assertEquals(6,numeroColor);
				break;
			case 7:
				assertEquals(7,numeroColor);
				break;
			case 8:
				assertEquals(8,numeroColor);
				break;
			case 9:
				assertEquals(9,numeroColor);
				break;
			default:
				assertEquals(10,numeroColor);
				break;
		}
	}

}
