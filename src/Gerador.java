import java.util.Random;
public final class Gerador {

    public static int GetId()
    {
        return new Random().nextInt(999999)+1;
    }
}
