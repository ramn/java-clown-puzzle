import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String args[]) throws java.lang.IllegalAccessException {

        Field[] fields = Volkswagen.class.getDeclaredFields();

        Volkswagen vw = new Volkswagen();

        for (Field field : fields) {
          if (field.getName() == "clowns") {
            field.setAccessible(true);

            Set<Clown> newClowns = new HashSet<Clown>();
            for (int i = 0; i < 20; i++) {
                newClowns.add(new Clown());
            }

            field.set(vw, newClowns);
          }
        }
        vw.done();
    }
}
