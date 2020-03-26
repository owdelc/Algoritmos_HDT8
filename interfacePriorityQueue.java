/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public interface interfacePriorityQueue<E extends Comparable<E>> {
    
    public E getFirst();
    
    public E remove();
    
    public void add(E value);
    
    public boolean isEmpty();
    
    public int size();
    
    public void clear();
    
}
