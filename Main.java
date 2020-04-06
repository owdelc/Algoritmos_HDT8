/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author oscar
 */
public class Main {
    
    /**
     *
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        VectorHeap<paciente> pacienteVH = new VectorHeap<paciente>();
        
        emergenciasJCF<paciente> pacientePQ = new emergenciasJCF<paciente>() {};
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("1.VectorHeap o 2.PriorityQueue");
        String eleccion = entrada.nextLine();
        
        if(eleccion.equals("1")){
          try{ 
              FileReader datos = new FileReader("Solicitudes.txt");
              BufferedReader lector = new BufferedReader(datos);
              String palabra = "";
              while ((palabra = lector.readLine()) != null){
                  String[] parte = palabra.split(",");
                  String nombre = parte[0];
                  String afeccion = parte[1];
                  String grado = parte[2];
                  pacienteVH.add(new paciente(nombre, afeccion, grado));
              }
              while (pacienteVH.size() != 0) {
                  System.out.println(pacienteVH.remove());
              }
              datos.close();
          }
          catch (Exception eX) {
                System.out.println("Excepcion leyendo datos del paciente: " + eX);
            }
        }
        if(eleccion.equals("2")){
            try{
                FileReader datos = new FileReader("Solicitudes.txt");
                BufferedReader lector = new BufferedReader(datos);
                String palabra = "";
                while ((palabra = lector.readLine()) != null) {
                    String[] parte = palabra.split(",");
                    String nombre = parte[0];
                    String afeccion = parte[1];
                    String grado = parte[2];
                    pacientePQ.add(new paciente(nombre, afeccion, grado));
                }
              lector.close();
            }
            catch(Exception ex){
                System.out.println("Imposible leer los del archivo - posible archivo corrupto");
            }
        }
        else{
            System.out.println("Porfavor elija una de las opciones disponibles");
        }
    }
    
}
