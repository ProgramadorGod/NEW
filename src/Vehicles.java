import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.*;

public class Vehicles {
    protected String Brand,Model;
    protected float Price;



    public Vehicles() throws IllegalAccessException {
        Scanner in = new Scanner(System.in);


        ArrayList<String> DataList = new ArrayList<>();
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(getClass().getDeclaredFields()));
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.print(field.getName() + " : ");

            if (field.getType() == float.class) {
                while (true) {
                    try {
                        float Value = in.nextFloat();
                        field.set(this, Value);
                        break;
                    } catch (Exception e) {
                        System.out.print("Try again with a valid number : ");
                        in.nextLine();  //clean the buffer
                    }
                }
            } else {
                String Value = in.nextLine();
                field.set(this, Value);
            }

        }
    }

    public ArrayList<String> Recycle() throws IllegalAccessException{
        ArrayList<String> DatesList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Vehicles a = new Vehicles();
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(getClass().getDeclaredFields()));
        for (Field field:fields) {
            DatesList.add(field.getName() + ": "+ field.get(this));
        }


        Class<?> patClass = a.getClass();
        Field[] patFields = patClass.getDeclaredFields();

        for (Field patField: patFields) {
            DatesList.add(patField.getName() + ": " + patField.get(a));
        }

        return DatesList;    }
}