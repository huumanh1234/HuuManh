/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author SV
 */
public class TD {
    private Hashtable td;
    private String tu;
    public TD(String a){
        this.tu=tu;
        td=new Hashtable();
    }
   
    public void them(String tu,Nghia ng){
        td.put(tu,ng);
    }
   
    public Nghia Tra(String tu){
        return(Nghia)td.get(tu);
    }
  
    public void hienThi(){
        Enumeration e=td.keys();
        while (e.hasMoreElements()){
            String tu=(String) e.nextElement();
            Nghia ng=(Nghia)td.get(tu);
            System.out.println(tu+" "+ng);
        }
    }
    
    public static void main (String[] angs){
        Hashtable td=new Hashtable();
        td.put("i","tôi");
        td.put("am","là");
        td.put("hello","chào");
        td.put("anyone","mội người");
        TD p=new TD("am");
        p.hienThi();
    }
}