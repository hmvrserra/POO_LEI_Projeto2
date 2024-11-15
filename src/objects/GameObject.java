package objects;

import pt.iscte.poo.utils.Point2D;
import pt.iscte.poo.gui.ImageTile;

public abstract class GameObject implements ImageTile {
    private String name;
    private Point2D position;
    private int layer;

    public GameObject(String name, Point2D position, int layer) {
        this.name = name;
        this.position = position;
        this.layer = layer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Point2D getPosition() {
        return position;
    }

    @Override
    public int getLayer() {
        return layer;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }
}

