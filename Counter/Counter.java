package Counter;
public class Counter{
    private static long counter;
    public static long newId(){
        if(counter == null){
            counter = 0;
        }
        ++counter;
        return counter;
    }
}