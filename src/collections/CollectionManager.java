/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tommib
 */
public class CollectionManager {
    
    /**
     * Prints out the given list
     * @param <T>
     * @param list
     */
    public static void printList(Collection list){
        list.stream().forEach(t -> System.out.println(t));
    } 
    
    /**
     * Returns a new list with values, which remainder is 0 with the given value & also removes any Strings from the list.
     * Example usage:
     * ArrayList list = CollectitionManager.Collection(list, 3).
     * List list = CollectionManager.Collection(list, 3)
     * 
     * @param <T>
     * @param list
     * @param remainder
     * @return 
     */
    public static <T> List filterList(Collection<T> list, int remainder){
        // MaptoInt ja sitten filter(s -> s % remainder != 0).collect ... ???
        return list.stream().filter(s -> s instanceof Integer).filter(s -> (Integer)s%remainder!=0).collect(Collectors.toCollection(ArrayList::new));
    }
}
