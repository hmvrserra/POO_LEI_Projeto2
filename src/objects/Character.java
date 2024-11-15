package objects;

import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

public abstract class Character extends GameObject {
    private int health;
    private int damage;

    public Character(String name, Point2D position , int layer, int health, int damage) {
        super(name, position, layer);
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void move(Direction direction) {
        Point2D newPosition = getPosition().plus(direction.asVector());
        if (newPosition.getX() < 0 || newPosition.getY() < 0 || newPosition.getX() >= 10 || newPosition.getY() >= 10) {
            return;
        }
        //COMPLETAR RESTRIÇÕES DE MOVIMENTO
        setPosition(newPosition);
    }
}
