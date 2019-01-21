import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args){
        demoObject d1 = new demoObject(1, -1, "1");
        demoObject d2 = new demoObject(2, 1, "2");
        demoObject d3 = new demoObject(3, 2, "3");
        demoObject d4 = new demoObject(4, 3, "4");
        demoObject d5 = new demoObject(5, 1, "5");
        demoObject d6 = new demoObject(6, 3, "6");
        List<demoObject> list = new ArrayList<demoObject>();

        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);

        for (int i = 0; i<6; i++){
            System.out.println(list.get(i));
        }
    }
}
