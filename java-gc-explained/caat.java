public class caat {

    public static void main (String[] args) {
        doCatStuff();
        System.out.println("I'm done doing cat stuff");
    }

    public static void doCatStuff () {
        Cat myCat = new Cat();
        myCat.meow();
        myCat = null;
    }

}