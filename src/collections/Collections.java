/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author tommib
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        ArrayList<Object> lista3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(i);
            lista2.add(i);
            lista3.add(i);
        }
        lista3.add("Toinen stringi");
        lista3.add("test");
        
        CollectionManager.printList(lista);
        CollectionManager.printList(lista2);
        CollectionManager.printList(lista3);
        CollectionManager.printList(CollectionManager.filterList(lista3, 2));

    }

}
