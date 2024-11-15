package objects;

import pt.iscte.poo.utils.Point2D;
public class Door extends StaticObject {

    public Door(Point2D position) {
        super("DoorClosed", position, 1);
    }

    //PORTA AINDA SEM OS DIFERENTES ESTADOS
}
