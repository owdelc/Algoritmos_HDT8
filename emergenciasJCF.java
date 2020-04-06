/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.PriorityQueue;
/**
 *
 * @author oscar
 * @param <E>
 */
public class emergenciasJCF <E>{
    private PriorityQueue cola;
    
    /**
     *
     */
    public emergenciasJCF(){
        cola = new PriorityQueue<E>();
    }
    
    /**
     *
     * @param v
     */
    public emergenciasJCF(PriorityQueue<E> v){
        cola = new PriorityQueue<E>(v.size());
        for(int i = 0; i < v.size(); i++){
            v.poll();
        }
    }
    
    /**
     *
     * @param value
     */
    public void add (E value){
        cola.add(value);
    }
    
    /**
     *
     * @return
     */
    public String next(){
        if(cola.isEmpty()){
            String alerta = "No hay pacientes en espera";
            return alerta;
        }
        else{
            String paciente = cola.poll().toString();
            return paciente;
        }
    }
    
    /**
     *
     * @param value
     * @return
     */
    public String check(E value){
        if(cola.isEmpty()){
            String alerta = "No hay pacientes en espera";
            return alerta;
        }
        else{
            String paciente = cola.poll().toString();
            return paciente;
        }
    }
    
    
    
   
           
        
        
    
}
