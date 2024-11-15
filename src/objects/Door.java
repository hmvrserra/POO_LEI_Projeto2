package objects;

import pt.iscte.poo.utils.Point2D;
public class Door extends StaticObject {

    public Door(Point2D position) {
        super("DoorOpen", position, 1);
    }
}
