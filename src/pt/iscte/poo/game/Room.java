package pt.iscte.poo.game;

import objects.*;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import pt.iscte.poo.utils.Point2D;
import pt.iscte.poo.gui.ImageGUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {
	//private Point2D heroStartingPosition = new Point2D(1, 1);
	private Manel manel;
	private List<GameObject> gameObjects = new ArrayList<>();

	public Room() {
		addBackground();
		loadRoomFromFile("rooms/room0.txt");
		ImageGUI.getInstance().addImages(gameObjects);
	}

	public void moveManel(Direction direction) {
		manel.move(direction);
	}

	private void addBackground() {
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				gameObjects.add(new Floor(new Point2D(x, y)));
			}
		}
	}

	private void loadRoomFromFile(String filename) {
		try (Scanner scanner = new Scanner(new File(filename))) {
			if (scanner.hasNextLine()) {
				scanner.nextLine(); // Ignorar a primeira linha
			}
			int y = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				for (int x = 0; x < line.length(); x++) {
					char ch = line.charAt(x);
					Point2D position = new Point2D(x, y);
					switch (ch) {
						case 'W':
							gameObjects.add(new Wall(position));
							break;
						case 'S':
							gameObjects.add(new Stair(position));
							break;
						case 'H':
							this.manel = new Manel(position);
							gameObjects.add(manel);
							break;
						case 'G':
							gameObjects.add(new Door(position));
							break;
						case 't':
							gameObjects.add(new Trap(position));
							break;
						case 's':
							gameObjects.add(new Sword(position));
							break;
						//ADICIONAR O RESTO DOS OBJETOS
					}
				}
				y++;
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + filename);
		}
	}



	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (GameObject gameObject : gameObjects) {
			sb.append(gameObject.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
