/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SV
 */

   package vn.viettuts.collection;
 
import java.util.Hashtable;
import java.util.Set;
 
public class HashTableExample1 {
    /**
     * main
     * 
     * @author viettuts.vn
     * @param args
     */
    public static void main(String args[]) {
        // init hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        // add elements to hashtable
        hashtable.put(3, "pham");
        hashtable.put(1, "huu");
        hashtable.put(2, "manh");
        hashtable.put(4, "Python");
        // show hashtable
        show(hashtable);
        // remove element
        hashtable.remove(4);
        // show hashtable after remove
        System.out.println("After remove:");
        // show hashtable
        show(hashtable);
 
    }
 
    /**
     * show HashMap
     * 
     * @param viettuts.vn
     */
    public static void show(Hashtable<Integer, String> hashtable) {
        Set<Integer> keySet = hashtable.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + hashtable.get(key));
        }
    }
}
 

