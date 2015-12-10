package de.hooman;

import de.sort.Sortable;

public class Soldier extends Human implements Sortable {
    private int height;

    public Soldier( String name, int height ) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int isBigger( Sortable sortable ) {
        Soldier soldier = (Soldier) sortable;
        if ( height < soldier.height ) {
            return -1;
        } else if ( height > soldier.height ) {
            return 1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Name: " + super.getName() + " Height: " + height;
    }
}
