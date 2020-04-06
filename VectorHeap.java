
import java.util.Vector;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 * IMPLEMENTACION DE VECTOR 
 * @param <E> 
 */
public class VectorHeap<E extends Comparable<E>> implements interfacePriorityQueue<E>{

    /** 
     * ASIGNACION DE NOMBRE AL VECTOR
     */
    private  Vector<E> info;
    
    /**
     * CONSTRUCTOR DEL METODO VECTOR HEAP
     */
    public VectorHeap(){
        info = new Vector<E>();
    }
    /**
     * TOMA EL PRIMER VALOR DEL VECTOR
     * @return 
     */
    public E getFirst() {
        return info.get(0);
    }
    /**
     * QUITA UN VALOR DEL VECTOR  
     * @return 
     */
    @Override
    public E remove() {
      E minimo = getFirst();
      info.set(0,info.get(info.size()-1));
      info.setSize(info.size()-1);
      if (info.size() > 1) Pushdownroot(0);
      return minimo;
      
    }
    /**
     * AGREGA UN VALOR AL VECTOR
     * @param value 
     */
    @Override
    public void add(E value) {
    info.add(value);
    percolateUP(info.size()-1);
    }
    /**
     * INDICA SI EL VECTOR ESTA VACIO
     * @return 
     */
    @Override
    public boolean isEmpty() {
    return info.size() == 0;
    }
    /**
     * DETERMINA EL TAMAÑO DEL VECTOR
     * @return 
     */
    @Override
    public int size() {
      return info.size();
    }
    /**
     * LIMPIA EL VECTOR 
     */
    @Override
    public void clear() {
        info.clear();
    }
    /**
     * MUEVE EL NODO A SU NUEVA UBICACION
     * @param escalon 
     */
    private void percolateUP(int escalon) {
       int origen = origen(escalon);
       E value = info.get(escalon);
       while(escalon > 0 && (value.compareTo(info.get(origen)) < 0)){
           info.set(escalon,info.get(origen));
           escalon = origen;
           origen = origen(escalon);
       }
       info.set(escalon, value);
       
    }
    /**
     * MUEVE EL NODO DESDE LA RAIZ A UNA POSICION ADECUADA
     * @param raiz 
     */
    private void Pushdownroot(int raiz) {
        int heapSize = info.size();
        E value = info.get(raiz);
        while (raiz < heapSize) {
            int poshijo = izquierda(raiz);
            if ((derecha(raiz) < heapSize) && ((info.get(poshijo + 1)).compareTo(info.get(poshijo))< 0)){
                poshijo ++;
                
            }
            if ((info.get(poshijo)).compareTo(value) < 0){
                info.set(raiz, info.get(poshijo));
                raiz = poshijo;
            }
            else{
                info.set(raiz, value);
                return;
            }
            
        }
    }
    /**
     * 
     * @param i
     * @return 
     */
    private static int origen(int i){
        return (i-1)/2;
    }
    /**
     * ENTERO DEL INDICE IZQUIERDO
     * @param i
     * @return 
     */
    private static int izquierda (int i){
        return (2*i)+1;
    }
    /**
     * ENTERO DEL INDICE DERECHO
     * @param i
     * @return 
     */
    private static int derecha (int i){
        return ((2*i)+1)+1;
    }
    /**
     * CONSTRUYE UNA NUEVA QUEUE
     * @param v 
     */
    public VectorHeap(Vector<E> v){
        int i;
        info = new Vector<E>(size());
        for(i = 0; i < v.size(); i++){
            add(v.get(i));
        }
    }
    /**
     * CONVIERTE LOS ELEMENTOS EN STRING 
     * @return 
     */
    public String toString(){
        return "VectorHeap{" + "info = " + info + "}";
    }

    
}
