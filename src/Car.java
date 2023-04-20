import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Car extends Vehicles{
    protected float Doors;

    public ArrayList<String> CarSet() throws IllegalAccessException {
        ArrayList<String> random = Recycle();
        return random;
    }

    public Car() throws IllegalAccessException {
    }
}
