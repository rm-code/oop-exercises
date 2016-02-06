package de.army;

import de.hooman.Soldier;
import de.sort.Sorter;

public class Army {
    private final String[] names = { "Barnett", "Sakuraba", "Tyson", "Aldo", "McGregor", "Gracie", "Klitschko", "Rambo", "Skywalker" };
    private Sorter sorter;
    private Soldier[] soldiers;

    public Army( int size ) {
        sorter = new Sorter();
        soldiers = new Soldier[size];

        for (int i = 0; i < soldiers.length; i++ ) {
            soldiers[i] = new Soldier( names[(int) (Math.random() * names.length)], 160 + (int) ( Math.random() * 50 ) );
        }

        sorter.sort( soldiers );

        for ( Soldier s: soldiers ) {
            System.out.println( s );
        }
    }

    public static void main( String[] args ) {
        Army army = new Army( 10 );
    }
}

// Zum Kompilieren    javac ordner/subordner/Klasse.java
// Zum Ausführen dann java  ordner.subordner.Klasse
