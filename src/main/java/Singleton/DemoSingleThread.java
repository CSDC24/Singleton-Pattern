package Singleton;

public class DemoSingleThread {
    public static void main ( String[] args ) {

        System.out.println ( "Two threads are created (BAR) und (FOO), only one is executed " );

        Singleton anotherSingleton = Singleton.getInstance ( "BAR" );
        Singleton singleton = Singleton.getInstance ( "FOO" );

        System.out.println ( singleton.value );
        System.out.println ( anotherSingleton.value );
    }
}