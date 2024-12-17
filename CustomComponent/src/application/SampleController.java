package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SampleController {
	@FXML
	private Rectangle rectangulo;
	@FXML
	private Button bt_rotarCuadrado;
	
	public void rotarFigura() {
		int numeroColor = (int)(Math.random() * 10);
		switch (numeroColor) {
			case 0:
				rectangulo.setFill(Color.YELLOW);
				break;
			case 1:
				rectangulo.setFill(Color.BROWN);
				break;
			case 2:
				rectangulo.setFill(Color.BISQUE);
				break;
			case 3:
				rectangulo.setFill(Color.BLUE);
				break;
			case 4:
				rectangulo.setFill(Color.BLUEVIOLET);
				break;
			case 5:
				rectangulo.setFill(Color.AQUA);
				break;
			case 6:
				rectangulo.setFill(Color.AZURE);
				break;
			case 7:
				rectangulo.setFill(Color.BEIGE);
				break;
			case 8:
				rectangulo.setFill(Color.CADETBLUE);
				break;
			case 9:
				rectangulo.setFill(Color.CORAL);
				break;
			default:
				rectangulo.setFill(Color.BLUE);
				break;
		}
		rectangulo.setRotate(rectangulo.getRotate() + 30);
	}
}
