package objects;

import pt.iscte.poo.utils.Point2D;
public abstract class Item extends GameObject {
    public Item(String name, Point2D position, int layer) {
        super(name, position, layer);
    }

}
