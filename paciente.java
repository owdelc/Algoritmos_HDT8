/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class paciente implements Comparable<paciente> {
    
    String nombre = "";
    String afeccion = "";
    String grado = "";

   paciente() {
       nombre = "";
       afeccion = "";
       grado = "";
    }
   
    /**
     *
     * @param nombre
     * @param afeccion
     * @param grado
     */
    public paciente(String nombre,String afeccion,String grado){
       this.grado = grado;
       this.afeccion = afeccion;
       this.nombre = nombre;
   }
   
    /**
     *
     * @return
     */
    public String id(){
       return nombre;
   }
   
    /**
     *
     * @param nombre
     */
    public void asignar(String nombre){
       this.nombre = nombre;
   }
   
    /**
     *
     * @return
     */
    public String evaluo(){
       return afeccion;
   }
   
    /**
     *
     * @param afeccion
     */
    public void diagnostico(String afeccion){
       this.afeccion = afeccion;
   }
   
    /**
     *
     * @return
     */
    public String status(){
       return grado;
   }
   
    /**
     *
     * @param grado
     */
    public void actualizacion(String grado){
       this.grado = grado;
   }
   
    /**
     *
     * @param o
     * @return
     */
    public int compareTo(paciente o){
       return grado.compareTo(o.grado);
   }
   
    /**
     *
     * @return
     */
    public String toString(){
       return "paciente: " + nombre + ", diagnostidado de: " + afeccion + ", su estado es:" + grado;
   }
   
    
    
    
    
}
