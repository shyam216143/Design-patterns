public class Jelabi{
    // eager way of creating singleton object
    private static Jelabi jelabi = new Jelabi;

    public static Jelabi getJelabi(){
        return jelabi;
    }
}