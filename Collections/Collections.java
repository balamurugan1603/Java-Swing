import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;

class Collections {
    public static void main(String args[]) {

        // ArrayList
        ArrayList<String> arr_list = new ArrayList<String>();
        arr_list.add("name1");
        arr_list.add("name2");
        Iterator arr_list_iter = arr_list.iterator();
        while(arr_list_iter.hasNext()) {
            System.out.println(arr_list_iter.next());
        }

        // Vector
        Vector<String> v = new Vector<String>();
        v.add("name1");
        v.add("name2");
        Iterator v_iter = v.iterator();
        while(v_iter.hasNext()) {
            System.out.println(v_iter.next());
        } 
    }
}