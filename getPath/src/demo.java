import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class demo {
    public static void main(String[] args){

        demoObject d6 = new demoObject(20, 7, "6", null);
        List<demoObject> childrenlist2 = Arrays.asList(d6);
        demoObject d5 = new demoObject(10, 3, "5", null);
        demoObject d4 = new demoObject(7, 4, "4", childrenlist2);
        List<demoObject> childrenlist4 = Arrays.asList(d4);
        demoObject d3 = new demoObject(4, 3, "3", childrenlist4);
        List<demoObject> childrenlist3 = Arrays.asList(d5, d3);
        demoObject d2 = new demoObject(3, 1, "2", childrenlist3);
        List<demoObject> childrenlist = Arrays.asList(d2);
        demoObject d1 = new demoObject(1, -1, "1", childrenlist);

        System.out.println(d1);

        System.out.println(getPath(d1, 7));
    }

    public static String getPath(demoObject demoObject, Integer id){
        Stack<demoObject> stack = new Stack<demoObject>();
        demoObject do1 = new demoObject();
        String path = "/";
        stack.add(demoObject);
        while(!stack.isEmpty()){
            do1 = stack.pop();
//            System.out.println(do1);
            path += do1.getId() + "/";
            if (do1.getId() == id){
                return path;
            }
            List<demoObject> childrenlist = do1.getChildren();
            if (childrenlist != null && !childrenlist.isEmpty()){
                for (demoObject do2 : childrenlist){
                    stack.push(do2);
                }
            }
        }
        return "no selected id";
    }
}
