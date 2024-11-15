package pt.iscte.poo.game;

import objects.Floor;
import objects.GameObject;
import objects.Manel;
import objects.Wall;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Room {
	
	private Point2D heroStartingPosition = new Point2D(1, 1);
	private Manel manel = new Manel(heroStartingPosition);
	private Floor floor1 = new Floor(new Point2D(0, 9));
	private Floor floor2 = new Floor(new Point2D(1, 9));
	private Floor floor3 = new Floor(new Point2D(2, 9));
	private List<GameObject> gameObjects = new ArrayList<>();
	
	public Room() {
		gameObjects.add(manel);
		gameObjects.add(floor1);
		gameObjects.add(floor2);
		gameObjects.add(floor3);
		ImageGUI.getInstance().addImages(gameObjects);
	}

	public void moveManel(Direction direction) {
		manel.move(direction);
	}

}