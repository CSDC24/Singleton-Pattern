package Singleton;

public class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep ( 1000 );
        }catch ( InterruptedException e ){
            System.out.println ("an Error happen" );
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (instance == null){
            instance = new Singleton ( value );
        }
        return instance;
    }

}