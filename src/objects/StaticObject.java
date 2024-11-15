package objects;

import pt.iscte.poo.utils.Point2D;
public abstract class StaticObject extends GameObject {
    public StaticObject(String name, Point2D position, int layer) {
        super(name, position, layer);
    }

}


