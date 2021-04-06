import org.junit.Test;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Vector;

public class testApp {
    @Test
    public void test(){
        Vector vector =new Vector();
        for (int i = 0; i < vector.size(); i++) {
            Object o = vector.get(i);
            System.out.println(o);
            if(!vector.contains(o)){
                vector.add(o);
            }
        }
    }
    @Test
    public void testSet(){
        TreeSet set =new TreeSet();
        set.add("sdasd");
        set.add("sdasd");
        set.add("Deep Space");
        System.out.println(set.size());
    }
}
