import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args){
        demoObject d1 = new demoObject(1, -1, "1");
        demoObject d2 = new demoObject(3, 1, "2");
        demoObject d3 = new demoObject(4, 3, "3");
        demoObject d4 = new demoObject(7, 4, "4");
        demoObject d5 = new demoObject(10, 3, "5");
//        demoObject d5 = new demoObject(5, 1, "5");
        demoObject d6 = new demoObject(20, 7, "6");
        List<demoObject> list = new ArrayList<demoObject>();

        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);

        System.out.println(getPath(list, 7));
    }

    public static String getPath(List<demoObject> list, Integer id){
        demoObject demo = new demoObject();

        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getId() == id){
                demo.setId(id);
                demo.setPid(list.get(i).getPid());
                demo.setContent(list.get(i).getContent());
                break;
            }
        }

        String s = "";
        if (demo.getPid() == -1){
            s = "/" + demo.getId() + "/";
            return s;
        } else {
            for (int j = 0; j<demo.getPid(); j++){
                s += "/" + (j+1);
            }
            s += "/" + demo.getId();
            return s;
        }
    }
}
