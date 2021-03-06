
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchFieldException {
        ///Task1
        RatingInterface ratingInterface = new RatingInterface() {
            @Override
            public void rating()  {
                System.out.println("Not good enough");
            }
        };

        ratingInterface.rating();


       ///Task2
        final GameDeveloper gameDeveloper = GameDeveloper.class.getConstructor(String.class, String.class, int.class, int.class).newInstance("Chess","Strategy",24,3);

        Field gameName = GameDeveloper.class.getDeclaredField("GameName");
        Field gameGenre = GameDeveloper.class.getDeclaredField("Genre");
        Field hourOfDevelop = GameDeveloper.class.getDeclaredField("hourOfDevelop");
        Field gameEvaluation = GameDeveloper.class.getDeclaredField("GameEvaluation");

        System.out.println(gameName + " " + gameGenre + " " + hourOfDevelop + " " + gameEvaluation);
        System.out.println(gameDeveloper);
    }
}
