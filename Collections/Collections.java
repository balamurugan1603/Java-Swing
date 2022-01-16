package Collections;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;

// Comparator
class LastNameAscending implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareToIgnoreCase(
                bStr.substring(j));
        if (k == 0) {
            return aStr.compareToIgnoreCase(bStr);
        }
        else {
            return k;
        }
    }
}

class Collections {

    public static void main(String args[]) {

        // ArrayList
        ArrayList<String> arr_list = new ArrayList<String>();
        arr_list.add("name1");
        arr_list.add("name2");
        Iterator<String> arr_list_iter = arr_list.iterator();
        while(arr_list_iter.hasNext()) {
            System.out.println(arr_list_iter.next());
        }

        // Vector
        Vector<String> v = new Vector<String>();
        v.add("name1");
        v.add("name2");
        Iterator<String> v_iter = v.iterator();
        while(v_iter.hasNext()) {
            System.out.println(v_iter.next());
        }

        // Hashtable
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "name1");    // ht.get(1);
        ht.put(2, "name2");    // ht.get(2);
        ht.put(3, "name3");    // ht.get(3);
        System.out.println(ht.entrySet());
        for(Map.Entry<Integer, String> element: ht.entrySet()) {
            System.out.println("Key: " + element.getKey() + ", Value: " + element.getValue());
        }

        // Stack - FILO
        Stack<String> st = new Stack<String>();
        st.push("name1");
        st.push("name2");
        st.push("name3");
        while(!st.empty()){
            // st.peek() => Return stack top without deleting
            System.out.println(st.pop());
        }

        // TreeMap - sorted by last name using comparator
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>(new LastNameAscending());
        tm.put("John Doe", 1);    // tm.get("John Doe");
        tm.put("Tom Smith", 2);
        tm.put("Jane Baker", 3);
        for(Map.Entry<String, Integer> element: tm.entrySet()) {
            System.out.println("Key: " + element.getKey() + ", Value: " + element.getValue());
        }        

    }
}