
import java.util.ArrayList;
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
        demoObject d8 = new demoObject(9, 5, "9",null);
        demoObject d9 = new demoObject(11, 5, "11",null);
        List<demoObject> childrenlist5 = Arrays.asList(d8, d9);
        demoObject d7 = new demoObject(5, 3, "5", childrenlist5);
        List<demoObject> childrenlist3 = Arrays.asList(d5, d3, d7);
        demoObject d2 = new demoObject(3, 1, "2", childrenlist3);
        List<demoObject> childrenlist = Arrays.asList(d2);
        demoObject d1 = new demoObject(1, -1, "1", childrenlist);

        System.out.println(d1);

        System.out.println(getPath(d1, 20));
    }

    public static List<List<Integer>> getPath(demoObject demoObject, Integer id){

        Stack<demoObject> stack = new Stack<demoObject>();
        demoObject do1 = new demoObject();
//        String path = "/";
        stack.push(demoObject);
        Stack<demoObject> tmpstack = new Stack<>();
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> pathlist = new ArrayList<>();

        while(!stack.isEmpty() || stack == null){
            do1 = stack.pop();
            List<demoObject> childrenlist = do1.getChildren();
            if (childrenlist != null && !childrenlist.isEmpty()){
                do1.setIstraverse(1);
                for (demoObject do2 : childrenlist){
                    stack.push(do2);
                }
            }
            if (do1.getIstraverse() == 1){
                tmpstack.push(do1);
            }
            if (childrenlist == null || childrenlist.isEmpty()){
                do1.setIstraverse(0);
                for (demoObject tmpdo : tmpstack){
                    path.add(tmpdo.getId());
                    tmpstack.pop();
                }
                pathlist.add(path);
            }
        }
        return pathlist;

//        Stack<demoObject> stack = new Stack<>();
//        demoObject do1 = new demoObject();
//        String path = "/";
//        stack.add(demoObject);
//        Stack<Integer> tmpstack = new Stack<>();
//        while(!stack.isEmpty()){
//            do1 = stack.pop();
////            System.out.println(do1);
//            path += do1.getId() + "/";
//
//            tmpstack.push(do1.getId());
////            System.out.print(tmpstack.toString());
//
//            List<demoObject> childrenlist = do1.getChildren();
//            if (childrenlist != null && !childrenlist.isEmpty()){
//                for (demoObject do2 : childrenlist){
//                    stack.push(do2);
//                }
//            } else if (do1.getId() == id){
//                return tmpstack.toString();
//            } else {
//                tmpstack.pop();
//            }
//        }

//        Stack<demoObject> stack = new Stack<>();
//        demoObject do1 = new demoObject();
//        String path = "/";
//        stack.add(demoObject);
//        Stack<Integer> tmpidstack = new Stack<>();
//        List<Stack> pathlist = new ArrayList<>();
//        Stack<demoObject> tmpobjstack = new Stack<>();
//        while(!stack.isEmpty()){
//            while (demoObject.getChildren() != null){
//
//            }
//            do1 = stack.pop();
////            System.out.println(do1);
////            path += do1.getId() + "/";
//
//            tmpidstack.push(do1.getId());
////            System.out.print(tmpstack.toString());
//
//            List<demoObject> childrenlist = do1.getChildren();
//            if (childrenlist != null && !childrenlist.isEmpty()){
//                for (int i = 0; i < childrenlist.size(); i++){
//                    stack.push(childrenlist.get(i));
//                }
//            } else {
////                stack.pop();
//                pathlist.add(tmpidstack);
//                System.out.println(pathlist);
//                System.out.println(tmpidstack);
//                System.out.println(stack.pop());
////                tmpidstack.clear();
////                break;
////                tmpidstack.removeAllElements();
////                return tmpidstack.toString();
//            }
//        }

//        return "no selected id";
//        return pathlist.toString();
    }
}
